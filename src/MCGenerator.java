import java.util.Random;
import java.util.Scanner;

public class MCGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String card;
        int numberRandoms;
        int sum;

        System.out.print("How many MasterCard numbers would you like to generate? ");
        int numberOfCard = in.nextInt();

        for(int j = 0; j < numberOfCard; j++) { //repeat card generation
            sum = 0; //sum digit of the card
            card =""; //card number
            if (rand.nextInt() < 0.5) { //generate random number if number is 0 to 0.5 0-1
                card += rand.nextInt(55 - 51 + 1) + 51; // start card number from 51 to 55
                numberRandoms = 13; // number of digit to generate
            } else {
                card += rand.nextInt(272099 - 222100 + 1) + 222100; //start from 222100 to 272099
                numberRandoms = 9; //number of digits to generate
            }
            //System.out.println(card);

            for (int i = 0; i < numberRandoms; i++) {
                card += rand.nextInt(10); //generate remaining card digits and numbers
            }
            //System.out.println(card+"\t"+card.length());
            int value;
            for (int i = 14; i >= 0; i--) { //calculate the sum using the formulae
                if (i % 2 == 0) { //only if it is even position
                    value = Integer.parseInt(card.substring(i, i + 1)) * 2; //multiply digit by two
                    if (value >= 10) { //multiplication is great than or equal 10
                        value = value - 9; // subtract 9
                    }
                } else {
                    value = Integer.parseInt(card.substring(i, i + 1)); //otherwise use the original digit
                }
                sum += value; //calculate the sum of digits
                //System.out.println(value);
            }
            int x; // last digit
            for (x = 0; x <= 9; x++) {
                if ((sum + x) % 10 == 0) { //looking for x value where sum + x is divisible by 10
                    card += x; //add x to the card number
                    break; //stop looking for x
                }
            }
            System.out.println(card); //display card number
        }

    }
}

import java.util.Scanner;

public class WorstHackerEver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long startTime, endTime = 0, possibilty;
        float time;
        int i;
        String word, guess;
        System.out.print("Enter a password, and I'll try to crack it: ");
        word = in.nextLine();

        guess = "";
        for (int j=0; j < word.length();j++){
            guess += '!';
        }

        possibilty=0;
        startTime = System.nanoTime();

        while (!guess.equals(word)) { // guess with word
            i = word.length() - 1;
            guess = guess.substring(0,i)+(char)(guess.charAt(i)+1); // changes 1st char of guess starting to the right
            while (i >= 0) {  // checks all char inside guess
                if (guess.charAt(i)>'~'){
                    guess = guess.substring(0,i)+"!"+guess.substring(i+1); // change to !
                    guess = guess.substring(0,i-1)+(char)(guess.charAt(i-1)+1)+guess.substring(i); // changes to the left +1
                }
                    i--;
                possibilty++;
                //System.out.println(guess);
            }
        }
            System.out.println("Password found: " + guess);
            endTime = System.nanoTime();
            time = (float) ((endTime - startTime)/(1000000000.0));
            System.out.println("It took me " + possibilty + " guess and " + time + " second");

    }
}

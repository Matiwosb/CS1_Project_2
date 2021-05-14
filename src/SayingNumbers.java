import java.util.Scanner;

public class SayingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter an integer to pronounce (any negative value to exit): ");
            number = in.nextInt();
            if (number != -1)
                // System.out.println(oneDigitToStr(number));
                System.out.println(numToStr(number));
        } while (number >= 0);
        System.out.println("kthxbye!");
    }

    public static String oneDigitToStr(int number) { //displaying one digit
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";      //comparing and calling afther # 9
            default:
                return "error Onedight";
        }
    }

    public static String twoDigitToStr(int number) { //uses one digit
        if (number == 10) return "ten";
        else if (number == 11) return "eleven";
        else if (number == 12) return "twoelve";
        else if (number == 13) return "thriteen";
        else if (number == 14) return "fourteen";
        else if (number == 15) return "fifteen";
        else if (number == 16) return "sixteen";
        else if (number == 17) return "seventeen";
        else if (number == 18) return "eighteen";
        else if (number == 19) return "ninteen";
        else {
            int digitOne = number % 10;
            int digtTwo = number / 10;
            switch (digtTwo) {
                case 0:
                    return oneDigitToStr(digitOne);
                case 2:
                    if (digitOne == 0) return "twenty";
                    else return "twenty " + oneDigitToStr(digitOne);
                case 3:
                    if (digitOne == 0) return "thrity";
                    else return "thrity " + oneDigitToStr(digitOne);
                case 4:
                    if (digitOne == 0) return "forty";
                    else return "forty " + oneDigitToStr(digitOne);
                case 5:
                    if (digitOne == 0) return "fifty";
                    else return "fifty " + oneDigitToStr(digitOne);
                case 6:
                    if (digitOne == 0) return "sixty";
                    else return "sixty " + oneDigitToStr(digitOne);
                case 7:
                    if (digitOne == 0) return "seventy";
                    else return "seventy " + oneDigitToStr(digitOne);
                case 8:
                    if (digitOne == 0) return "eighty";
                    else return "eighty " + oneDigitToStr(digitOne);
                case 9:
                    if (digitOne == 0) return "ninety";
                    else return "ninety " + oneDigitToStr(digitOne);
                default:
                    return "error";
            }
        }
    }

    public static String threeDigitToStr(int number) {
        int digitThree = number / 100;
        int remainingDigit = number % 100;
        if (digitThree == 0) {   // uses one digit and two digits
            return twoDigitToStr(remainingDigit);
        } else {
            if (remainingDigit == 0) {
                return oneDigitToStr(digitThree) + " hunderd";
            } else {
                return oneDigitToStr(digitThree) + " hunderd " + twoDigitToStr(remainingDigit);
            }
        }
    }
        public static String numToStr ( int number){
            int billionNumber = number / 1000000000;
            String text = "";  //store a number and print the other values
            if(billionNumber > 0){
                text += oneDigitToStr(billionNumber) + " billion ";
                number = number % 1000000000;
            }
            int millionNumber = number / 1000000;
            if (millionNumber > 0){
                text += threeDigitToStr(millionNumber) + " million ";
                number = number % 1000000;
            }
            int thousandNumber = number / 1000;
            if(thousandNumber > 0){
                text += threeDigitToStr(thousandNumber) + " thousand ";
                number = number % 1000;
            }
            if (number > 0)
            text += threeDigitToStr(number);
            if(text.equals("")) return "zero";
            return text;
        }
}

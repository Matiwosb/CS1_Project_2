import java.util.Scanner;

public class Collatz {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        int counter;
        System.out.print("Enter starting value(must be a positive integer): ");
        n = in.nextInt();

        while(n <= 0){
            System.out.print("Must be a positive integer! Try again: ");
            n = in.nextInt();
        }

        counter = 1;
        System.out.println(n + " ");
        while(n != 1){
            if((n%2) != 0) {
                //n = n/2;
                n = 3*n + 1;
            }else
                n=n/2;
            System.out.println(n + " ");
            counter = counter + 1;
        }
        System.out.println("Number of terms: " + counter);
    }
}

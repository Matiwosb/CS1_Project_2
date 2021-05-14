import java.util.Scanner;

public class Factorials {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n;
        long answer = 1;
        System.out.print("Enter a number: ");
        n = in.nextInt();

        for(long i = n; i >= 1; i--){
            answer = answer * i;
        }
        System.out.println(answer);
    }
}

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        int k;
        int answer = 1;
        int answer2 = 1;
        System.out.print("Enter a number: ");
        n = in.nextInt();
        System.out.print("Enter another number: ");
        k = in.nextInt();

        for(int i = k; i >= 1; i--){
           answer = answer * i;
        }
        for(int j = n; j >= n-k+1; j--) {
           answer2 = answer2 * j;

        }

        System.out.println(answer2/answer);

    }
}

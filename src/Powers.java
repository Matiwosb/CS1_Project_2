import java.util.Scanner;

public class Powers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, answer;
        answer = 1;
        System.out.print("Enter the base: ");
        a = in.nextInt();
        System.out.print("Enter the power: ");
        b = in.nextInt();

        for(int i = 0; i < b; i++){
                answer = answer * a;
        }
        System.out.println(answer);
    }
}

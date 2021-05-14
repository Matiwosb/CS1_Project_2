import java.util.Scanner;

public class RunAnalyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weeks;
        System.out.print("How many weeks of data do you have?");
        weeks = in.nextInt();
        while (weeks < 2 ){
            System.out.print("Must enter at least 2 weeks, try again: "); //weeks
            weeks = in.nextInt();
        }
        double miles[] = new double[weeks]; // stores the number of miles in a week
        for (int i = 1; i <= weeks; i++){
            System.out.print("Enter miles run for week " + i + ": ");
            miles[i-1] = in.nextDouble();
            while(miles[i-1] < 0){
                System.out.print("You can’t run a negative number of miles, try again: ");
                miles[i-1]=in.nextDouble();
            }
        }
        double sum=0;
        boolean isIncreasing = true;
        for (int i=1;i < weeks;i++){
            if (miles[i] <= miles[i-1]){
                isIncreasing = false;
            }
            sum+=miles[i]-miles[i-1];
        }
        if (isIncreasing){
            System.out.println("Your mileage is consistently increasing!");
        }else{
            System.out.println();
            System.out.println("Your mileage is NOT consistently increasing!");
        }
        System.out.println("Average weekly change: " + (sum/(weeks-1)));
    }
}

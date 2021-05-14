import java.util.Scanner;

public class GetRichVerySlowly {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
// User input variables
        double initialDeposit;
        double interestRate;
        double extra;
        double extra2;
        int numYears;
        int num;
// Calculation variables
        double yearStart;
        double interest;
        double yearEnd;
// Loop variable
        int year;
        System.out.print("Current age: ");
        num = scnr.nextInt();
// Get user input for starting balance
        System.out.print("Starting balance: ");
        initialDeposit = scnr.nextDouble();
// Get user input for retirement age
        System.out.print("Desired retirement age: ");
        numYears = scnr.nextInt();
// Get user input for extra contribution at the end of each year
        System.out.print("Desired balance at retirement age: ");
        extra2 = scnr.nextDouble();

        System.out.print("Projected annual return(percent): ");
        interestRate = scnr.nextDouble();
        //yearStart = initialDeposit;
        extra = 0;
        yearEnd = 0;

        while(yearEnd < extra2) { // used to increase the extra value
            extra = extra + 0.01;
            yearStart = initialDeposit;
// Loop that runs numYears iterations
            for (year = num; year <= numYears; year++) { // calculate the end using the current extra value
// Compute the interest earned and ending balance for the current year
                interest = yearStart * interestRate / 100.0;
                yearEnd = yearStart + interest + extra;
// Compute the starting balance for next year
                yearStart = yearEnd;
            }
        }
        System.out.printf("To reach that goal, you’ll need to contribute $%.2f per year until you retire.", extra);
        System.out.println("\nProject growth: ");
        System.out.println("_______________");
        System.out.format("Age\t %12s\t%12s\t%12s\t%12s\n", "Start", "Interest", "Extra", "End");
        yearStart = initialDeposit;
// Loop that runs numYears iterations
        for (year = num; year <= numYears; year++) { // calculating and display the table with extra value
// Compute the interest earned and ending balance for the current year
            interest = yearStart * interestRate / 100.0;
            yearEnd = yearStart + interest + extra;

            System.out.format("%2d\t%12.2f\t%12.2f\t%12.2f\t%12.2f\n", year, yearStart, interest, extra, yearEnd);
// Compute the starting balance for next year
            yearStart = yearEnd;
        }
    }
}

import java.util.Scanner;

public class UniversalBallotCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int IDNumber = 2548;
        int vote[] = new int[IDNumber];
        do {
            System.out.print("Enter candidate’s ID number (1-2548, any negative number to exit): ");
            int candidate = in.nextInt();
            if (candidate > 2548 || candidate == 0)
                System.out.println("Invalid ID number!");
            else if (candidate < 0)
                break;
            else
                vote[candidate-1]++;

        } while (IDNumber >= 0);

        System.out.println(" ");
        System.out.println("Vote Counts: ");
        System.out.println("---------------");
        for (int i=0;i<IDNumber;i++){
            if (vote[i]>0)
                System.out.println("Candidate " + (i + 1) + ": " + vote [i] + " vote (s)"); //used for at least one candidate
        }

        System.out.println(" ");
        System.out.println("Election Winner(s): ");
        System.out.println("--------------------");
        int max = 0;
        for (int i=0;i<IDNumber;i++){
            if (vote[i]>max)
                max=vote[i];   //have only one votes
        }
        for (int i=0;i<IDNumber;i++){
            if (vote[i]==max){  //winner
                System.out.println("Candidate " + (i+1)); //used for at least one candidate
            }
        }
    }
}

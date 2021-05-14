import java.util.Arrays;
import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f, p, c;

        System.out.print("How many friends are you throwing this party for? ");
        f = in.nextInt();
        System.out.print("How many cans will each person drink? ");
        p = in.nextInt();
        System.out.print("How many cans are in each pack? ");
        c = in.nextInt();
        planParty(f, c, p);
        System.out.println("Return value from planParty2: " + planParty2(f,c, p)); //planParty2

    }

    public static void planParty(int f, int c, int p) {
        int people = f + 1;
        int totalCan = people * p;
        double totalPack = Math.ceil((double) totalCan/c);
        //int extra = totalCan - canPeople;

        System.out.println((int) totalPack + " pack(s) needed");
        System.out.println((int) (c*totalPack - totalCan) + " extra can(s)");

    }
    public static int planParty2(int f, int c, int p){
        int people = f + 1;
        int totalCan = people * p;
        double totalPack = Math.ceil((double) totalCan/c);
        //int extra = totalCan - canPeople;

        return (int)totalPack;
    }
}

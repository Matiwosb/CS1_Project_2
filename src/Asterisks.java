import java.util.Scanner;
public class Asterisks {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double store1, store2, store3, store4, store5;
        double sales1, sales2, sales3, sales4, sales5;
        System.out.print("Enter today's sales for store: " );
        sales1 = in.nextInt();
        System.out.print("Enter today's sales for store: ");
        sales2 = in.nextInt();
        System.out.print("Enter today's sales for store: ");
        sales3 = in.nextInt();
        System.out.print("Enter today's sales for store: ");
        sales4 = in.nextInt();
        System.out.print("Enter today's sales for store: ");
        sales5 = in.nextInt();

        System.out.println();
        System.out.print("SALES BAR CHART\n");
        store1 = sales1/100;
        System.out.print("Store 1: ");
        for(int i = 0; i <= store1; i++){
            System.out.print("*");
        }
        System.out.print("\nStore 2: ");
        store2 = sales2/100;
        for(int i = 0; i <= store2; i++){
            System.out.print("*");
        }

        System.out.print("\nStore 3: ");
        store3 = sales3/100;
        for(int i = 0; i <= store3; i++){
            System.out.print("*");
        }

        System.out.print("\nStore 4: ");
        store4 = sales4/100;
        for(int i = 0; i <= store4; i++){
            System.out.print("*");
        }

        System.out.print("\nStore 5: ");
        store5 = sales5/100;
        for(int i = 0; i <= store5; i++){
            System.out.print("*");
        }
    }
}

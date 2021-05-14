public class SumofRowColumn {
    public static void main(String[] args) {
        int a[][] = {
                {78, 19, 62},
                {40, 33, 18},
                {25, 6, 99},
                {13, 81, 70}
        };

        int row1 = a[0][0] + a[0][1] + a[0][2];
        int row2 = a[1][0] + a[1][1] + a[1][2];
        int row3 = a[2][0] + a[2][1] + a[2][2];
        int row4 = a[3][0] + a[3][1] + a[3][2];
        int totalsum = row1 + row2 + row3 + row4;
        System.out.print("Row 1: ");
        System.out.println(a[0][0] + "+" + a[0][1] + "+" + a[0][2] + "=" + row1);
        System.out.print("Row 2: ");
        System.out.println(a[1][0] + "+" + a[1][1] + "+" + a[1][2] + "=" + row2);
        System.out.print("Row 3: ");
        System.out.println(a[2][0] + "+" + a[2][1] + "+" + a[2][2] + "=" + row3);
        System.out.print("Row 4: ");
        System.out.println(a[3][0] + "+" + a[3][1] + "+" + a[3][2] + "=" + row4);

        System.out.println("Overall total: " + totalsum);


    }
}


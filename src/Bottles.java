public class Bottles {
    public static void main(String[] args){
        int waterNum = 99;
        String word = "bottles";

        while (waterNum > 0) {
            System.out.println();
            System.out.println(waterNum + " " + word + " of water on the wall, " + waterNum + " " + word + " of water");
            waterNum = waterNum - 1;

            if (waterNum == 1) {
                word = "bottle";
            }
            if (waterNum > 0) {
                System.out.println("Take one down, pass it round, \n" + waterNum + " " + word + " of water on the wall.");
            }
        }

        if (waterNum == 0) {
            System.out.println("No more bottles of water on the wall");
        }
    }
}

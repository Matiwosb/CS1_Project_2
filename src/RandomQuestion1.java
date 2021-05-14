public class RandomQuestion1 {
    public static void main(String[] args){

        int x = 7;
        int y = 4;

        int product = multiplication(x, y);
        System.out.println(product);

    }

    public static int multiplication(int x, int y){


        if(y > 1) {
            y = y - 1;
            return x+multiplication(x,y);
        }


        return x;
    }
}

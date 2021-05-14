public class RecursiveRepeatedAddition1 {
    public static void main(String[] args) {
        System.out.println(repeatedAddition(7,4));
    }
    public static int repeatedAddition(int x, int y){
        if(y > 1) {
            y = y - 1;
            return x+repeatedAddition(x,y);
        }
        return x;
    }
}
 /*if(x==0 || y==0)
            return 0;
        else
            return y + repeatedAddition(y,--x);
         */
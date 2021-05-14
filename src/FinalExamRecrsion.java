public class FinalExamRecrsion {
    public static void main(String[] args) {

        System.out.println(sumUp(10));

    }

    public static int sumUp(int a){

        int x = a-1;
        int sum = x+a;
        if(x <= 1)
            return sum;
        else
            return sum+sumUp(a-2);

    }

}

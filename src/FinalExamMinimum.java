public class FinalExamMinimum {
    public static void getMinimum(int a, int b){
        int min;
        if(a<b)
            min = a;
        if(b<a)
            min = b;
        System.out.println(min);
    }

    public static void main(String[] args) {
        getMinimum(4,5);
    }
}

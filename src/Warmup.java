public class Warmup {
    public static void main(String[] args){
        int number;
        double num, sum;
        number = -11;
        num = 100.0; sum=0;
        int n = 3840;
        int n2 = 2;
        int x = 1000;
        while(number < 20) {
            System.out.println(number);
            number = number + 3;
        }

        for(double i = 0;i < 50.0; i=i+1) {
            //for (double j = 0; j <= 50.0;j=0.02) {
                System.out.println(num);
                num = num + num * 0.02;
               // System.out.println(sum);
            //}
        }
        for(int i = 0;i < 100;i++){
            System.out.println(n);
            n = n - n2;
            n2 = n2 + 1;
        }
        //System.out.println(x);
        for(int i = 0; i <= 997; i++){
            //System.out.println(x);
            x= x - 3;
            if(i%2 != 0 && i > 0){
                System.out.println(-x);
            }else{
                System.out.println(x);
            }
        }
    }
}

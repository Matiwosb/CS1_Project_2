import java.util.Scanner;

public class ArrayMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array;
        System.out.print("How many numbers would you like to enter? (must be at least 3) ");
        array = in.nextInt();
        while (array < 3) {
            System.out.print("Invalid value, must be at least 3. Please try again: ");
            array = in.nextInt();
        }
        int value[] = new int[array];
        for (int i = 0; i < array; i++) { //to start with 0 the index should equal to 0
            System.out.print("Enter value for index " + i + ": ");
            value[i] = in.nextInt();
            //while (value[i - 1] < 0) {
                //System.out.println("Invalid value, must be at least 3. Please try again: ");
                //value[i - 1] = in.nextInt();
            //}
        }
        System.out.println();
        int [] minMax = findMinAndMax(value); //to get the max and min therwise call to the method findminmax
        System.out.println("Min value: " + value[minMax[0]]+", max value: " + value[minMax[1]]);
        System.out.println("Average excluding two lowest values: " + averageWithDrop(value));
    }
    public static int[] findMinAndMax(int[] x){
        int minVal = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i=0; i < x.length;i++){
            if(x[i] < minVal){
                minVal = x[i];
                minIndex=i;  //printout # of index of the max
            }
        }
        int maxVal = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i=1; i < x.length;i++){
            if(x[i] > maxVal){
                maxVal = x[i];
                maxIndex=i;
            }
        }
        int[] output = new int[2];
        output[0] = minIndex;
        output[1] = maxIndex;
        return output;
    }
    public static double averageWithDrop(int[] x){
    double avg = 0;
    int indexFirstMin = findMinAndMax(x)[0];
    int [] copyOne = new int[x.length -1];
    System.arraycopy(x,0,copyOne,0,indexFirstMin); //copying left to the min to copyone
    System.arraycopy(x,indexFirstMin+1,copyOne,indexFirstMin,x.length-indexFirstMin-1);
    int []copyTwo = new int[x.length-2];
    int indexSecondMin = findMinAndMax(copyOne)[0];
    System.arraycopy(copyOne,0,copyTwo,0,indexSecondMin); //coyping right to left to find copytwo; tell it from where it starts and ends
    System.arraycopy(copyOne,indexSecondMin+1,copyTwo,indexSecondMin,copyOne.length-indexSecondMin-1);
    for (int i=0;i < copyTwo.length;i++){
        avg += copyTwo[i];
    }
    return avg/copyTwo.length;
    }
}

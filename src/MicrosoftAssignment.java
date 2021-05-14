/*This program finds an element
 *and it adds the element to the right and left
 * then it checks if the number in the element equal the
 * sum of the right and the left. If it finds a number that is
 * different it prints the index of that number.
 *
 * To solve this problem, I used a for-loop and if-statements.
 * The reason I chose a for-loop is because it loop until it finds a value
 * that is not the same.
 */

public class MicrosoftAssignment {
    public static int balanced(int arr[]) {

        int n = arr.length; // the number of values in the array
        int[] leftSum = new int[n]; //calculates from left to right
        leftSum[0] = arr[0]; //copy the 1st value to the left
        for (int i = 1; i < n; i++) //stores in different positions
            leftSum[i] = leftSum[i - 1] + arr[i]; //adds the left sum to the array

        // Forming right sum array from n-1
        int[] rightSum = new int[n]; // calculates from right to left
        rightSum[n - 1] = arr[n - 1]; // copy last value to the right
        for (int i = n - 2; i >= 0; i--) // store the sum of the value right to the left
            rightSum[i] = rightSum[i + 1] + arr[i]; //adds the right sum to the array

        // Find the point where left and right
        // sums are the same.
        for (int i = n-1; i >= 1; i--) // it checks for right to left
            if (leftSum[i] == rightSum[i]) // checks the array equal to rightSum and leftSum
               return i;
       /* for (int i = 1; i < n - 1; i++) // left to right
            if (prefixSum[i] == suffixSum[i])
                return i;*/
        return -1;
    }


    public static void main(String[] args) {
        int[] numbers1 = {-8, 2, 6, 2, -5, 4, 1};
        System.out.println(balanced(numbers1));
        int[] numbers2 = {2, 4, 6};
        System.out.println(balanced(numbers2));
        int[] numbers3 = {4, -3, 5, 1, 2, 5, -1};
        System.out.println(balanced(numbers3));
        int[] numbers4 = {16, 8, 2, 4, 4, 6};
        System.out.println(balanced(numbers4));
        int[] number5= {2, 4, 4, 0, -3, 3, 1, 6};
        System.out.println(balanced(number5));
        int[] number6= {2, 3, 5, 5, 2};
        System.out.println(balanced(number6));
    }
}
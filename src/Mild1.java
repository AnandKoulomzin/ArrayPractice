/***
 * Goal: Determine and print the sum of array "a"
 * Method 1: no loop
 * Method 2: for loop
 * Method 3: for each loop
 * Rating: MILD
 */

public class Mild1 {

    public int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        Mild1 practice = new Mild1();
    }

    public Mild1() {

        int sum = 0;

        /***
         * Your code goes here
         */
//        method 1: no loop
//        sum = a[0]+ a[1]+ a[2]+ a[3]+ a[4]+ a[5]+ a[6]+ a[7]+ a[8]+ a[9];
//        sum = sum +a[0]; // sum is now 1
//        sum = sum +a[1]; // sum is now 3
//        sum = sum +a[2]; // sum is now 6
//        sum = sum +a[3];
//        sum = sum +a[4];
//        sum = sum +a[5];
//        sum = sum +a[6];
//        sum = sum +a[7];
//        sum = sum +a[8];
//        sum = sum +a[9];
        //method 2: for loop
//        for (int i = 0; i < a.length; i++) {
//            //   System.out.println(a[i]);
//            sum = sum +a[i];
//        }
        //method 3: for each loop
        //instead of iterating through indexes, we are iterating over the array itself
        for (int element : a) {
            sum = sum + element;
        }

        System.out.println("The sum is " + sum);

    }

}
/***
 * Goal: Determine and print the mean of array "a"
 * Rating: MILD
 */

public class Mild2 {

    public int[] a;
    public int mean;


    public static void main(String[] args) {
        Mild2 practice = new Mild2();
    }

    public Mild2() {
        int sum = 0;
        a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }

        /***
         * Your code goes here
         */
        for (int element : a) {
            sum = sum + element;
            mean = sum/20;
        }
        System.out.println("The mean is " + mean);

    }

}
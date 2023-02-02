/***
 * Goal: Determine and print the median of array "a"
 * Rating: MEDIUM
 */

public class Medium1 {

    public int[] a;
    public int median;
    boolean even;

    public static void main(String[] args) {
        Medium1 practice = new Medium1();
    }

    public Medium1() {

        a = new int[(int)(Math.random()*20+10)];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }

        java.util.Arrays.sort(a);

            if (a.length % 2==1) {
                System.out.println("array is odd length");
                median=a[(a.length+1)/2-1];
            }
            if (a.length % 2==0) {
                System.out.println("array is even length");

            }



        /***
         * Your code goes here
         */

        System.out.println("The median is " + median);


    }

}
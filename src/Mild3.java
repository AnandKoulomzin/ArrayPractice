/***
 * Goal: Determine whether array "a" contains a certain value "b"
 * The output of your program should be a print statement, either:
 * "The array does not contain value ___" OR
 * "The array contains value ___"
 * (and have it print the value, not underscores)
 * Rating: MILD
 */

public class Mild3 {

    public int[] a;
    public int b;

    public static void main(String[] args) {
        Mild3 practice = new Mild3();
    }

    public Mild3() {
        boolean doesContain = false;
        a = new int[50];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
            if (a[i] == b) {
                doesContain = true;
            }
        }


        b = 45;

        /***
         * Your code goes here
         */

        for (int element : a) {
            if (doesContain==true) {
                System.out.println("the array does contain value b");

            } else {
                System.out.println("the array does not contain value b");
            }
        }
    }
}
package day14;

import java.util.Arrays;
import java.util.Scanner;

public class Scope {
    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int []elements)
        {
            this.elements=elements;
        }
        void computeDifference(){
            int n=elements.length;
            Arrays.sort(elements);
            maximumDifference=Math.abs(elements[n-1]-elements[0]);
        }


    } // End of Difference class

    public class Solution {

        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }

}

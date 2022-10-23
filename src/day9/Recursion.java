package day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Recursion {

    class Result {

        /*
         * Complete the 'factorial' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER n as parameter.
         */

        public static int factorial(int n) {
            // Write your code here
            // Recursive Case
            System.out.println("n: " + n);
            if(n > 1) {
                return n * factorial(n - 1);
            }
            // Base Case n = 1
            else {
                return n ;
            }
        }
    }
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.factorial(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }



}

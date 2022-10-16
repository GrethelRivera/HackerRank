package thirty_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day2_Operators {

    class Result {

        /*
         * Complete the 'solve' function below.
         *
         * The function accepts following parameters:
         *  1. DOUBLE meal_cost
         *  2. INTEGER tip_percent
         *  3. INTEGER tax_percent
         */

        public static void solve(double meal_cost, int tip_percent, int tax_percent) {
            // Write your code here

            double tip = meal_cost * tip_percent / 100;
            double tax = meal_cost * tax_percent / 100;
            int totalCost = (int) Math.round(meal_cost + tip + tax);
            System.out.print(totalCost);
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            double meal_cost = scanner.nextDouble();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int tip_percent = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int tax_percent = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            solve(meal_cost, tip_percent, tax_percent);
            scanner.close();

        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

            int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

            int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

            Result.solve(meal_cost, tip_percent, tax_percent);

            bufferedReader.close();
        }
    }
}


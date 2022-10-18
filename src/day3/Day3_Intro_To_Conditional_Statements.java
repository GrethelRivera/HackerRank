package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3_Intro_To_Conditional_Statements {

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            bufferedReader.close();
            if (N % 2 == 0) {
                if (N >= 2 && N <= 5)
                    System.out.print("Not Weird");
                else if (N >= 6 && N <= 20)
                    System.out.print("Weird");
                else
                    System.out.print("Not Weird");
            } else
                System.out.print("Weird");


        }
    }
}


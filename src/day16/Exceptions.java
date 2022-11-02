package day16;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        try {
            int no;
            no = Integer.parseInt(S);
            System.out.println(no);
        } catch (Exception a) {
            System.out.println("Bad String");
        }
    }


}

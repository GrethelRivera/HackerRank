package day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



    public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();

            String emailRegEx = ".+@gmail\\.com$";
            Pattern pattern = Pattern.compile(emailRegEx);

            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                String name = in.next();
                String email = in.next();
                Matcher matcher = pattern.matcher(email);

                if (matcher.find()) list.add(name);
            }

            Collections.sort(list);

            list.forEach(System.out::println);
        }
    }
}

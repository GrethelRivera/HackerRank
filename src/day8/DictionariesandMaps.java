package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesandMaps {

//    class Solution{
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            Map<String, Integer> myMap = new HashMap<String,Integer>();
            int n = in.nextInt();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                myMap.put(name,phone);
            }
            while(in.hasNext()){
                String s = in.next();
                if (myMap.get(s) == null){
                    System.out.println("Not found");
                }else {

                    System.out.println(s+"=" + myMap.get(s));
                }

                // Write code here
            }
            in.close();
        }
    }



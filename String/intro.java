package String;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // String s = "hello";
        // System.out.println(s);
        // String s1 = scn.nextLine();
        // String s2 = scn.nextLine();
        // System.out.println(s1);
        // // System.out.println(s2);
        // String s = scn.next();
        // System.out.println(s);
        // System.out.println(s.length());

        // char ch = s.charAt(2);
        // System.out.println(ch);
        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        // System.out.println(ch);

        // }
        // // s.charAt(0) = 'z'; //a ,b,c,d --=> z,b,c,d this doesn't work
        // String s = "abcd";
        // System.out.println(s.substring(0, 2)); // ab
        // System.out.println(s.substring(1));// bcd 1 se lekr sbb de dega
        // scn.close();
        // USING FOR LOOP IN STRING
        // String s = "a b c d";
        // for (int i = 0; i < s.length(); i++) {
        // for (int j = i + 1; j <= s.length(); j++) {
        // System.out.println(s.substring(i, i));
        // }
        // }
        // TO ADD TWO STRING:-
        String s1 = "HELLO";
        String s2 = "world";
        String s3 = s1 + " " + s2;
        ;
        System.out.println(s3);
        ;

        System.out.println("hello" + 10 + 20); // hello1020

        System.out.println(10 + 20 + "hello"); // 30hello

        // to spilit
        String s = "abc def ghi jkl";
        String[] parts = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);

        }
        scn.close();

    }
}

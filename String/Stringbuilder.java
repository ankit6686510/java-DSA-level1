package String;

import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        char ch = sb.charAt(0);
        System.out.println(ch);
        sb.setCharAt(0, 'd');
        System.out.println(sb);
        // to insert character
        sb.insert(2, 'y');
        System.out.println(sb);
        // to remove character
        sb.deleteCharAt(2);
        System.out.println(sb);
        // to add at last
        sb.append('g');
        System.out.println(sb);
        // to know length
        System.out.println(sb.length());
        scn.close();

    }

}

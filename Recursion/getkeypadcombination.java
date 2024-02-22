package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getkeypadcombination {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> words = getkpc(str);
        System.out.println(words);
    }

    static String[] codes = { ".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getkpc(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getkpc(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch - '0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char chcode = codeforch.charAt(i);
            for (String rstr : rres) {
                mres.add(chcode + rstr);

            }

        }
        return mres;

    }
}
// PSEUDOCODE
/*
 * Function getKeypadCombinations(str):
 * if length of str is 0:
 * Create a new ArrayList bres
 * Add an empty string to bres
 * Return bres
 * 
 * Extract the first character ch from str
 * Extract the rest of the string ros from str
 * Call getKeypadCombinations recursively on ros and store the result in rres
 * 
 * Create a new ArrayList mres
 * Extract the keypad code for ch from the static codes array
 * 
 * for each character chcode in the keypad code:
 * for each keypad combination rstr in rres:
 * Add (chcode + rstr) to mres
 * 
 * Return mres
 * 
 * Input: Read a string str from the user
 * Result: Call getKeypadCombinations with str and store the result in words
 * Print words
 * 
 */
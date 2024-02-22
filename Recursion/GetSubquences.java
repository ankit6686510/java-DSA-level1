package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubquences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);

    }

    // bc-->[--,-c,b-,bc]
    // abc-->[---,--c,-b-,-bc,a--,ab-,abc]
    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);// a
        String ros = str.substring(1);// bc
        ArrayList<String> rres = gss(ros);// [--c,-c,b-,bc]

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add("" + rstr);
        }
        for (String rstr : rres) {
            mres.add(ch + rstr);
        }
        return mres;

    }

}
// psudocode
/*
 * Function getSubsequences(str):
 * if length of str is 0:
 * Create a new ArrayList bres
 * Add an empty string to bres
 * Return bres
 * 
 * Extract the first character ch from str
 * Extract the rest of the string ros from str
 * Call getSubsequences recursively on ros and store the result in rres
 * 
 * Create a new ArrayList mres
 * 
 * for each subsequence rstr in rres:
 * Add rstr to mres
 * 
 * for each subsequence rstr in rres:
 * Add (ch + rstr) to mres
 * 
 * Return mres
 * 
 * Input: Read a string str from the user
 * Result: Call getSubsequences with str and store the result in res
 * Print res
 */
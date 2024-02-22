package Recursion;

import java.util.Scanner;

public class printZigZag {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);


    }
    public static void pzz(int n){
        if(n==0){
            return;

        }
        System.out.println("pre" +n);
        pzz(n-1);
        System.out.println("in"+n);
        pzz(n-1);
        System.out.println("post"+n);
    }
}

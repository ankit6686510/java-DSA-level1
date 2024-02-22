package Recursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
            
        }
        displayarrreverse(arr,0);
    }
    public static void displayarrreverse(int[]arr,int idx){
        if(idx==arr.length){
            return;
        }
        displayarrreverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}

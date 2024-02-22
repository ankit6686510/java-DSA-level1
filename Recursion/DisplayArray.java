package Recursion;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
            
        }
        displayarr(arr,0);
    }
    //ex-->idx se ened tak sb print kr dega
    //faith-->idx+1 se end tak print karna janta hai
    public static void displayarr(int[]arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayarr(arr, idx+1);
    }
}

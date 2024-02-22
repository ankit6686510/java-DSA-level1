package Recursion;

import java.util.Scanner;

public class maximumArray {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
            
        }
        int max=maxofarray(arr,0);
        System.out.println(max);
    }
    public static int maxofarray(int[]arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int misa=maxofarray(arr, idx+1);
        if(misa>arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}

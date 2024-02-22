package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeno {
    public static Boolean isprime(int val) {
        for (int div = 2; div * div <= val; div++) {
            if (val % div == 0) {
                return false;
            }
        }
        return true;

    }

    public static void solution(ArrayList<Integer> al) {
        for (int i = al.size() - 1; i >= 0; i--) {
            int val = al.get(i);
            if (isprime(val) == true) {
                al.remove(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();// enter no of element first
        ArrayList<Integer> al = new ArrayList<>(); // take input of element enter
        for (int i = 0; i < n; i++) {// iterate over the input given
            al.add(scn.nextInt());

        }
        solution(al);
        System.out.println(al);
        scn.close();

    }
}
package Arraylist;

import java.util.ArrayList;

public class introArraylist {
    // to declare an arraylist
    // ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "-->" + list.size());
        // to add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + "-->" + list.size());

        // TO INSERT IN ARRAYLIST at specific position
        list.add(1, 1000);
        System.out.println(list + "-->" + list.size());
        // to get
        int val = list.get(1);
        System.out.println(val);

        // TO SET
        list.set(1, 2000);
        System.out.println(list + "-->" + list.size());

        // TO REMOVE
        list.remove(1);
        System.out.println(list + "-->" + list.size());

        // Arraylist to string
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("hello");
        l2.add("bello");
        l2.add("cello");
        System.out.println(l2 + "-->" + l2.size());

        // using for loop
        for (int i = 0; i < list.size(); i++) {
            int val1 = list.get(i);
            System.out.println(val1);

        }

        // ANOTHER WAY OF USING LOOP
        for (int val1 : list) {
            System.out.println(val1);

        }
        // another way to print LISTS IS SYSOUT(list);
        System.out.println(list);

    }
}

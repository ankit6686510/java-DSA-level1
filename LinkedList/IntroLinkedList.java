package LinkedList;

import java.util.LinkedList;

public class IntroLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public IntroLinkedList() {
        this.size = 0;
    }

    public void insertionFirst(int val) {
        Node node = new Node(val);
        node.next = head;

        if (head == null) {
            tail = node;
        }

        head = node;
        size++;
    }
    //TO INSERT AN ELEMENT AT LAST PLACE  tine complexity will be constant time o(n)
    public void insertionLast(int val){
        if( tail == null){
            insertionFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next =node;
        tail =node;
        size++;
    }
    public void insert(int val,int index){
        if(index==0){
            insertionFirst(val);
            return;
        }
        if(index==size){
            insertionLast(val);
            return;
        }
        Node temp =head;
        for(int i=1; i<index; i++){
            temp =temp.next;
        }
        Node node =new Node(val,temp.next);
        temp.next=node;
        size++;

    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast =get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next =null;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;//null or node ,null agar koi element nhi h to and node if element is there
    }
    public Node get(int index){
        Node node =head;
        for(int i =0; i<index; i++){
            node = node.next;
        }
        return node;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail =null;
        }
        size--;
        return val;
    }
    //if you want to delete at some particular idex T.C O(n) bcz we arer traversing
    public int delete(int index){
        if(index ==0){
            return deleteFirst();

        }
        if(index ==size-1){
            return deleteLast();
            
        }
        Node prev =get( index-1);
        int val =prev.next.value;
        prev.next =prev.next.next;

        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        IntroLinkedList linkedList = new IntroLinkedList();
        linkedList.insertionFirst(3);
        linkedList.insertionFirst(2);
        linkedList.insertionFirst(8);
        linkedList.insertionFirst(17);
        linkedList.insertionLast(99);
        linkedList.insert(100, 3);
        linkedList.display();
        System.out.println(linkedList.deleteFirst());
        System.out.println(linkedList.deleteLast());
        System.out.println(linkedList.delete(2));
        System.out.println(linkedList.find(16));//to find where is 16 it will return null
        
        




        linkedList.display();
    }
}

package LinkedList;

public class circularLinkedList {
    private Node head;
    private Node tail;
    public circularLinkedList(){
        this.head =null;
        this.tail =null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
            
        }
        tail.next = node;
        node.next =head;
        tail = node;
    }
    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.val == val){
            head =head.next;
            tail.next =head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == val){
                node.next =n.next;
                break;
            }
            node = node.next;
          
            
         }while (node!=head);
    }
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + "-->");
                node = node.next;
            } while (node != head);
            System.out.println("end");  // Added to move to the next line after printing the circular linked list.
        }
    }
    

    private class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    
}
public static void main(String[] args) {
    circularLinkedList linkedList = new circularLinkedList();
    linkedList.insert(3);
    linkedList.insert(4);
    linkedList.insert(5);
    linkedList.insert(6);
    linkedList.insert(8);
    linkedList.delete(4);
    linkedList.display();
    
}
}
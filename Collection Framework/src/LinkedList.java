import java.util.Arrays;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }

    public static void printList(Node temp){
        int size = 0;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
            size++;
        }

        System.out.println("size: " + size);
    }


    public static void printRecursively(Node temp){

        if (temp == null) return;
            printReverse(temp.next);
            System.out.println(temp.data);
        
    }

    public static void printReverse(Node temp){
        if(temp == null) return;
        printReverse(temp.next);
        System.out.println(temp.data);
    }
    public static void main(String [] args){
        Node node = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(4);
        Node node5 = new Node(8);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // System.out.println(node.data);
        // System.out.println(node.next.data);
        // System.out.println(node.next.next.data);
        // System.out.println(node.next.next.next.data);
        // System.out.println(node.next.next.next.next.data);
        
        // Node temp = node;
        // for(int i = 0; i < 5; i++){
        //     System.out.println(temp.data);
        //     temp  = temp.next;
        // }

        printList(node);
        //printRecursively
        // printRecursively(node);
        // printReverse(node);
        


    }
}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class linkedlist{
    Node head = null;
    Node tail = null;

    void addLast(int element){
        Node newNode = new Node(element);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
           
        }
    }

    void addFirst(int element){
        Node newNode = new Node(element);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            Node temp = newNode;
            temp.next = head;
            head = newNode;
        }
    }

    void addAtIndex(int index, int value){

        int size = size();

        Node newnNode = new Node(value);

        if(index == 0){
                Node temp = newnNode;
                temp.next = head;
                head = newnNode;

                return;
        }else if(index < 0 || index > size){
            System.out.println("Invalid index");
            return;
        }

        int count = 0;
        Node temp = head;
        
        while (temp != null) {
            if(count+1 == index){
                Node temp2 = temp.next;
                temp.next = newnNode;
                temp.next.next = temp2;

                if(index == size){
                    tail = newnNode;   
                }

                return;  
            }

            count++;
            temp = temp.next;
        }

        System.out.println("You have entered an invalid index!");
        return;
    }

    boolean remove(int index){

        if(index > size()-1){
            return false;
        }

        if(index == 0){
            head = head.next;
            return true;
        }

        int count = 0;
        Node temp = head;
        while (temp != null) {

            if(temp.next == tail){
                tail = temp;
                tail.next = null;
                return true;
            }

            if(count+1==index){
                temp.next = temp.next.next;
                return true;
            }


            count++;
            temp = temp.next;
        }
        return false;
    }

    int get(int index){
        int size = size();
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return -1;
        }

        Node temp = head;
        for(int i = 0; i < size; i++){
            if(i == index){
                return temp.data;
            }

            temp = temp.next;
        }

        return -1;
    }

    int size(){
        Node temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }

        return size;
    }


    

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


public class LinkedListImpl {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addAtIndex(4, 7);
        ll.addAtIndex(5, 8);
        ll.addAtIndex(6, 9);

        // System.out.println("tail : "+ ll.tail.data);

        ll.print();
        // System.out.println("________ after remove___________ ");

        // System.out.println(ll.remove(9));;
        System.out.println("tail : "+ ll.tail.data);
        System.out.println("head : "+ ll.head.data);

       System.out.println("element is " + ll.get(2));



        

        
    }
}

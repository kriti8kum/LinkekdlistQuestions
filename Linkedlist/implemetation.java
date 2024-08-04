package Linkedlist;

public class implemetation {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class Linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            } else{
                tail.next= temp;
                
            }
            tail = temp;
        }
        void insertAddAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp =temp.next;
            }
            return count;
        }
    }

    public static void main(String args[]){
        Linkedlist sc = new Linkedlist();
        System.out.println("Insert the first head:");
        sc.insertAtEnd(4);
        sc.display();
        System.out.println("Insert the all data:");
        sc.insertAtEnd(6);
        sc.display();
        System.out.println("Find the size of the Linkedlist:");
        System.out.println(sc.size());
        System.out.println("Insert the  another data after the 6:");
        sc.insertAtEnd(59);
        sc.display();
        System.out.println("find the size of linkedlist:");

        System.out.println(sc.size());
        System.out.println("Insert the At the beginign of the linkedilist:");
        sc.insertAddAtHead(8);
        sc.display();

    }
}

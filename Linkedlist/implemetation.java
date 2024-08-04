package Linkedlist;

public class implemetation {
    
    public static class Node{
        int data;
        Node next;
        int size=0;
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

        void delete(int idx){
            Node temp = head;
            
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
                tail = temp;
            }
            temp.next = temp.next.next;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){ // O(n)
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp =temp.next;
            }
            return count;
        }
        void insertAt(int val, int idx){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            } else if(idx==0){
                insertAddAtHead(val);
                return;
            }else if(idx<0 || idx >0){
                System.out.println("worng indedx");
            }
            for(int i = 1; i<= idx-1; i++){
                temp = temp.next;

            }
            t.next = temp.next;
            temp.next = t;

        }
        int getAt(int idx){
            if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head;
        
            for(int i =1; i<=idx; i++){
                temp=temp.next;
            }
            return temp.data;
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

        System.out.println(sc.getAt(-1));
        sc.delete(3);
        sc.display();
    }
}

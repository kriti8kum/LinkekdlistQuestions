package Linkedlist;

public class nthNodeFromEnd {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        temp=head;
        for(int i=1; i<=m-1; i++){
            temp=temp.next;
        }
        return temp;
        
    }
    public static void  main(String[] args){
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(600);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        //100->200->300->400->500->600
        //400
        Node q = nthNode(a, 3);
        System.out.println(q.data);
    }
    
}

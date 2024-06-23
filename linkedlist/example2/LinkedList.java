package Dsa.linkedlist.example2;

import java.util.Stack;

public class LinkedList {
    private Node head;
    public void addAtLast(int x){
        Node p =new Node(x);
        if(head==null){
            head=p;
            return;
        }
        Node temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(p);

    }
    public void printReverse(){
        if(head==null){
            System.out.println("Empty linked list");
        }
        Stack<Integer> s=new Stack<>();
        Node temp=head;
        while(temp!=null){
            int x;
            x=temp.getData();
            s.push(x);
            temp=temp.getNext();
        }
        while(s.empty()!=true)
            System.out.println("Reverse data:"+s.pop());
    }

}

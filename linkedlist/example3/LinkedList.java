package Dsa.linkedlist.example3;

import java.util.Stack;

public class LinkedList {
    private Node head;
public void insert(int x){
    Node p=new Node(x);
    if(head==null){
        head=p;
        return;
    }
    Node temp=head;
    if(x>temp.getData()){

    }
}
    public void printData(){
        if(head==null){
            System.out.println("Empty Linked list");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }

    }
}

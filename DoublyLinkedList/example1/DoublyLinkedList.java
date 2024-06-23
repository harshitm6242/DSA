package Dsa.DoublyLinkedList.example1;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node head;

    public void addAtLast(int x){
        Node p=new Node(x);
        if(head==null){
            head=p;
            return;
        }
        Node temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setPrev(temp);
    }

    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
    public void prepend(int x){
        Node p=new Node(x);
        if(head==null){
            head=p;
            return;
        }
        p.setNext(head);
        head.setPrev(p);
        head=p;
    }
    public int removeLast(){
        if(head==null){
            throw new NoSuchElementException("List is Empty");
        }
        if(head.getNext()==null){
            int x= head.getData();
            head=null;
            return x;
        }
        Node temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        int x=temp.getData();
        temp=temp.getPrev();
        temp.setNext(null);
        return x;

    }
}

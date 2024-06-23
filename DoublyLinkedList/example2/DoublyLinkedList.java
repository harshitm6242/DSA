package Dsa.DoublyLinkedList.example2;

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

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    public boolean removeData(int x) {
        if (head == null) {
            throw new NoSuchElementException("List is Empty");
        }
        if (head.getData() == x) {
            if(head.getNext()==null) {
                head = null;
                return true;
            }
            head=head.getNext();
            head.setPrev(null);
            return true;
        }
        Node temp = head;
        while (temp.getNext() != null) {
        if(temp.getData()==x){
            temp.getPrev().setNext(temp.getNext());
            temp.getNext().setPrev(temp.getPrev());
            return true;
        }
        temp=temp.getNext();
        }
        if(temp.getData()==x){
            temp.getPrev().setNext(null);
            return true;
        }
         return false;
    }
}

package Dsa.CircularLinkedList.example4;


import java.util.NoSuchElementException;

public class CircularLinkedList {
    private Node head;
    public void addAtLast(int x){
        Node p =new Node(x);
        if(head==null){
            head=p;
            p.setNext(p);
            return;
        }
        Node temp=head;
        while(temp.getNext()!=head){
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setNext(head);
    }
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        do {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }while(temp!=head);
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while(temp.getNext()!=head){
            temp=temp.getNext();
        }
        head=head.getNext();
        temp.setNext(head);
    }
    public boolean removeData(int x){
        if(head==null){
            throw new NoSuchElementException("List is empty");
        }
        if(x==head.getData()){
            if(head==head.getNext()){
                head=null;
                return true;
            }
            Node temp=head;
            while(temp.getNext()!=head){
                temp=temp.getNext();
            }
            head=head.getNext();
            temp.setNext(head);
            return true;
        }
        Node temp=head,prev;
        while(temp.getNext()!=head){
            prev=temp;
            temp=temp.getNext();
            if(x==temp.getData()){
                if(temp.getNext()==head){
                    prev.setNext(head);
                    return true;
                }
                prev.setNext(temp.getNext());
                return true;
            }
        }
       return false;
    }
}

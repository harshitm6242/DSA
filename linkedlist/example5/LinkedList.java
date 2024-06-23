package Dsa.linkedlist.example5;

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
    public int CountList(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.getNext();

        }
        return count;
    }
    public Node findMidNode(){
        int c=CountList();
        int i=1,x=(c/2)+1;
        Node temp=head;
        while(i<x) {
            i++;
            temp = temp.getNext();
        }
        return temp;
    }
}

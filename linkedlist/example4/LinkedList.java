package Dsa.linkedlist.example4;

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
    public void reverse(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp.getNext()!=null){
            Node x=temp.getNext();
            temp.setNext(prev);
            prev=temp;
            temp=x;
        }
        temp.setNext(prev);
        head=temp;
    }
    public void remove(int x){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        else if(x==head.getData()) {
            head = head.getNext();
            System.out.println("Element Removed:"+x);
            return;
        }
        Node temp=head,prev;
        while(temp.getNext()!=null){
            prev=temp;
            temp=temp.getNext();
            if(temp.getData()==x){
                prev.setNext(temp.getNext());
                temp.setNext(null);
                System.out.println("Element Removed:"+x);
                return;
            }

        }
        System.out.println("Element not found which you want to remove in linked list:"+x);
    }
}

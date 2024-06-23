package Dsa.CircularLinkedList.example3;


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
}
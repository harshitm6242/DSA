package Dsa.CircularLinkedList.example2;


public class CircularLinkedList {
    private Node head;
   public void prepend(int x){
       Node p=new Node(x);
       if(head==null){
           head=p;
           p.setNext(p);
           return;
       }
       Node temp=head;
       while(temp.getNext()!=head) {
           temp=temp.getNext();
       }
       temp.setNext(p);
       p.setNext(head);
       head=p;

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
}

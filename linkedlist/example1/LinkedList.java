package Dsa.linkedlist.example1;

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
    public int searchNode(int x){
        if(head==null){
            return 0;
        }


        Node temp=head;
        int pos=0;
        while(temp!=null){
            int y=temp.getData();
            pos++;
            if(x==y)
                return pos;
            else
                temp=temp.getNext();
        }

        return -1;
    }
}

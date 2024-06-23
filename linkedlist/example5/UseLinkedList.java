package Dsa.linkedlist.example5;

public class UseLinkedList {
        public static void main(String[] args) {
            LinkedList list=new LinkedList();
            list.addAtLast(10);
            list.addAtLast(20);
            list.addAtLast(30);
            list.addAtLast(40);
            list.addAtLast(50);
            list.addAtLast(60);
            list.printData();
            Node mid=list.findMidNode();
            System.out.println("Middle Node is:"+mid.getData());
        }
    }


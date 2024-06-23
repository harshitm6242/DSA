package Dsa.linkedlist.example4;

public class UseLinkedList {
        public static void main(String[] args) {
            LinkedList list=new LinkedList();

            list.addAtLast(10);
            list.addAtLast(20);
            list.addAtLast(30);
            list.addAtLast(40);
            list.addAtLast(50);
            list.printData();
//            System.out.println("After reversing the Data");
//            list.reverse();
//            list.printData();
            list.remove(10);
            System.out.println("After removing");
            list.printData();
        }
    }


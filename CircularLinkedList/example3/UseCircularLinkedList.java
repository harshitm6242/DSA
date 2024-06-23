package Dsa.CircularLinkedList.example3;

public class UseCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtLast(50);
        list.printList();
        System.out.println("After Removing");
        list.removeFirst();
        list.removeFirst();
        list.printList();
    }
}

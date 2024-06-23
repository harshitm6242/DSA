package Dsa.CircularLinkedList.example2;

public class UseCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.prepend(10);
        list.prepend(20);
        list.prepend(30);
        list.prepend(40);
        list.prepend(50);
        list.printList();
    }
}

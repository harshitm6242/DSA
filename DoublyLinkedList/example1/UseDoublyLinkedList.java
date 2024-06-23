package Dsa.DoublyLinkedList.example1;

import java.util.NoSuchElementException;

public class UseDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
//        list.addAtLast(10);
//        list.addAtLast(20);
//        list.addAtLast(30);
//        list.addAtLast(40);
          list.prepend(10);
          list.prepend(20);
          list.prepend(30);
          list.prepend(40);
          list.printList();
       try {
           System.out.println("After Removing last node:" + list.removeLast());
           list.printList();
       }catch (NoSuchElementException ex){
           System.out.println(ex.getMessage());
       }
    }
}

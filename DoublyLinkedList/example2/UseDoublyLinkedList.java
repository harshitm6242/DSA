package Dsa.DoublyLinkedList.example2;

import java.util.NoSuchElementException;

public class UseDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
          list.printList();
       try {
           System.out.println("Is element removed ?"+list.removeData(4));
           list.printList();
       }catch (NoSuchElementException ex){
           System.out.println(ex.getMessage());
       }
    }
}

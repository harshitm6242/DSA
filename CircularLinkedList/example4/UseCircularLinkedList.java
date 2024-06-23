package Dsa.CircularLinkedList.example4;

import java.util.NoSuchElementException;

public class UseCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtLast(50);
        list.printList();
        boolean x=true;
       try{
           x=list.removeData(50);
       }catch(NoSuchElementException ex){
           System.out.println(ex.getMessage());
           System.exit(0);
       }
        if(x){
            System.out.println("Element Deleted");
            System.out.println("After removing circular linked list is:");
            list.printList();
        }
        else{
            System.out.println("Element not found");
        }
    }
}

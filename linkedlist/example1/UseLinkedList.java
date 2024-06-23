package Dsa.linkedlist.example1;

public class UseLinkedList {
        public static void main(String[] args) {
            LinkedList list=new LinkedList();
            System.out.println("Total nodes :"+list.CountList());
            list.addAtLast(100);
            list.addAtLast(200);
            list.addAtLast(300);
            list.addAtLast(400);
            list.addAtLast(500);
            list.printData();
            System.out.println("Total nodes :"+list.CountList());

            int x=list.searchNode(300);
            if(x==0){
                System.out.println("list is empty");
            }
            else if(x==-1){
                System.out.println("Element not found");
            }
            else{
                System.out.println("Element found at pos :"+x);
            }
        }
    }


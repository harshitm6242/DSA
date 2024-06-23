package Dsa.Queue.example4;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class UseQueue {
    public static void main(String[] args) {
        Queue <Integer>q = new LinkedBlockingDeque<>(3);
        Scanner sc = new Scanner(System.in);
        int choice;
        int x;

            do {
                System.out.println("Select an option:\n1.enqueue\n2.dequeue\n3.peek\n4.quit");
                System.out.println("Enter your choice:");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                       try {
                           System.out.println("Enter element to insert:");
                           x = sc.nextInt();
                           q.add(x);
                           System.out.println("Inserted:" + x);
                       }catch(IllegalStateException ex){
                           System.out.println("Exception while adding data:"+ex.getMessage());
                       }
                        break;
                    case 2:
                       try{
                           x = q.remove();
                        System.out.println("Deleted element:" + x);
                       }catch(NoSuchElementException e) {
                           System.out.println("Exception in deleting" + e.getMessage());
                       }
                        break;
                    case 3:
                        try{
                            x = q.element();
                            System.out.println("Head element:" + x);
                        }catch(NoSuchElementException e) {
                            System.out.println("Exception to found element" + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Thank you");
                        break;
                    default:
                        System.out.println("Wrong choice!Try again");
                }
            } while (choice != 4);
        }

    }


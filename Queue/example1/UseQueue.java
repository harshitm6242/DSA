package Dsa.Queue.example1;


import java.util.Scanner;

public class UseQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        Scanner sc = new Scanner(System.in);
        int choice;
        int x;
        try {
            do {
                System.out.println("Select an option:\n1.enqueue\n2.dequeue\n3.peek\n4.quit");
                System.out.println("Enter your choice:");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter element to insert:");
                        x = sc.nextInt();
                        q.enqueue(x);
                        System.out.println("Inserted:" + x);
                        break;
                    case 2:
                        x = q.dequeue();
                        System.out.println("Deleted element:" + x);
                        break;
                    case 3:
                        x = q.peek();
                        System.out.println("Top element:" + x);
                        break;
                    case 4:
                        System.out.println("Thank you");
                        break;
                    default:
                        System.out.println("Wrong choice!Try again");
                }
            } while (choice != 4);
        } catch(QueueException e) {
            System.out.println(e.getMessage());
        }

    }
}

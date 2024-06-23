package Dsa.Stack.examples3;
import Dsa.Stack.examples2.StackException;

import java.util.Scanner;
public class UseStack {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        Scanner sc = new Scanner(System.in);
        int choice;
        int x;
        try {
            do {
                System.out.println("Select an option:\n1.push\n2.pop\n3.peek\n4.quit");
                System.out.println("Enter your choice:");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter element to push:");
                        x = sc.nextInt();
                        s.push(x);
                        System.out.println("pushed:" + x);
                        break;
                    case 2:
                        x = s.pop();
                        System.out.println("popped element:" + x);
                        break;
                    case 3:
                        x = s.peek();
                        System.out.println("Top element:" + x);
                        break;
                    case 4:
                        System.out.println("Thank you");
                        break;
                    default:
                        System.out.println("Wrong choice!Try again");
                }
            } while (choice != 4);
        } catch(StackException e) {
            System.out.println(e.getMessage());
        }

    }
}


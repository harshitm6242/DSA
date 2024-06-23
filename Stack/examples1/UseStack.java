package Dsa.Stack.examples1;
import java.util.Scanner;
public class UseStack {
        public static void main(String[] args) {
            Stack s=new Stack(5);
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter 5 number:");
            for(int i=0;i<5;i++){
                s.push(sc.nextInt());
            }
            System.out.println("Top most element:" +s.peek());
            for(int i=0;i<5;i++){
                System.out.print(s.pop()+" ");
            }
        }
}

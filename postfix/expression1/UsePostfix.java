package Dsa.postfix.expression1;
import java.util.Scanner;

public class UsePostfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a valid postfix expression:");
        String postfix=sc.next();
        Postfix p=new Postfix(postfix);
        System.out.println("Result:"+p.evaluate());

    }
}

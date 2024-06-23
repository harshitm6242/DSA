package Dsa.postfix.expression3;

import java.util.Scanner;

public class UseConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter infix:");
        String postfix=sc.next();
        Convert c=new Convert(postfix);
        c.toPostFix();
        System.out.println(c.toString());
    }
}

package Dsa.prefix.expression2;

import java.util.Scanner;

public class UseConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter infix:");
        String prefix=sc.next();
        Convert c=new Convert(prefix);
        c.toPreFix();
        System.out.println(c.toString());
    }
}

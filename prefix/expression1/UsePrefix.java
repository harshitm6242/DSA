package Dsa.prefix.expression1;

import java.util.Scanner;

public class UsePrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a valid prefix expression:");
        String prefix=sc.next();
        Prefix p=new Prefix(prefix);
        System.out.println("Result:"+p.evaluate());

    }
}

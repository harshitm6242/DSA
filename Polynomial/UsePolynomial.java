package Dsa.Polynomial;

public class UsePolynomial {
    public static void main(String[] args) {
        Polynomial First=new Polynomial();
        Polynomial Second=new Polynomial();
        First.addAtLast(2,1);
        First.addAtLast(4,3);
        First.addAtLast(3,5);
        First.addAtLast(8,6);
        First.printList();
        Second.addAtLast(10,1);
        Second.addAtLast(2,2);
        Second.addAtLast(5,4);
        Second.addAtLast(3,5);
        Second.printList();

        Polynomial Third=new Polynomial();
        Third.addPoly(First,Second);
        System.out.println("\nAfter addition:");
        Third.printList();
    }
}

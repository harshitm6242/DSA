package Dsa.Polynomial;

public class Node {
    private int coef,exp;
    private Node next;

    public Node(){

    }

    public Node(int coef, int exp) {
        this.coef = coef;
        this.exp = exp;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

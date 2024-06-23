package Dsa.Polynomial;

import java.util.NoSuchElementException;

public class Polynomial {
    private Node head;

    public void addAtLast(int coeff,int expo){
        Node p=new Node(coeff,expo);
        if(head==null){
            head=p;
            return;
        }
        Node temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(p);
    }

    public void printList(){
        if(head==null){
            throw new NoSuchElementException("List is Empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.getCoef()+"X"+temp.getExp()+"+");
            temp=temp.getNext();
        }
        System.out.println();
    }
    public void addPoly(Polynomial p1,Polynomial p2){
        if(p1.head==null && p2.head==null){
            System.out.println("Addition not possible");
            return;
        }
        Node f=p1.head;
        Node s=p2.head;
        Node temp=null,p=null;
        while(f!=null &&s!=null){
            p=new Node();
            if(head==null){
                head=p;
            }else{
                temp.setNext(p);
            }
            temp=p;
            if(f.getExp()<s.getExp()){
                p.setCoef(f.getCoef());
                p.setExp(f.getExp());
                f=f.getNext();
            }else if(s.getExp()<f.getExp()){
                p.setCoef(s.getCoef());
                p.setExp(s.getExp());
                s=s.getNext();
            }
            else{
                p.setCoef(f.getCoef()+s.getCoef());
                p.setExp(s.getExp());
                f=f.getNext();
                s=s.getNext();
            }
        }
        Node q=null;
        if(f!=null){
            q=f;
        }else if(s!=null){
            q=s;
        }
        while(q!=null){
            p=new Node(q.getCoef(),q.getExp());
            if(head==null){
                head=p;
            }else{
                temp.setNext(p);
            }
            temp=p;
            q=q.getNext();
        }
    }
}

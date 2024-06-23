package Dsa.DynamicStack;

import Dsa.Stack.examples2.StackException;

public class Stack {
    private Node tos;
    private int count;
    public void push(int x){
        Node p=new Node(x);
        count++;
        p.setNext(tos);
        tos=p;
    }
    public int pop(){
        if(tos==null){
            throw new StackException("Stack Underflow");
        }
        count--;
        int x=tos.getData();
        tos=tos.getNext();
       return x;
    }
    public int peek(){
        if(tos==null){
            throw new StackException("Stack Underflow");
        }
        int x=tos.getData();
        return x;
    }
    public int size(){
        if(count==0){
            System.out.println("Stack Underflow");
            return 0;
        }
         return count;
    }
    public boolean isEmpty(){
        if(count>0){
            return false;
        }
        return true;
// return count==0;
    }
}

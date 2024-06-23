package Dsa.Stack.examples1;

public class Stack {
        private int arr[];
        private int tos,size;
        public Stack(int x){
            arr=new int[x];
            size=x;
            tos=-1;
        }
        public void push(int x){
            if(tos==(size-1)){
                System.out.println("Stack Overflow");
                return;
            }
            tos++;
            arr[tos]=x;


        }
        public int pop(){
            if(tos==-1){
                System.out.println("Stack Underflow");
                return -1;
            }
            int x;
            x=arr[tos];
            tos--;
            return x;
        }
        public int peek(){
            if(tos==-1){
                System.out.println("Stack Underflow");
                return -1;
            }
            int x;
            x=arr[tos];
            return x;
        }
    }



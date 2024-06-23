package Dsa.Stack.examples2;

public class UseStack {
        public static void main(String[] args) {
            Stack s=new Stack(5);
            int x=10;
            try {
                for (int i = 0; i < 5; i++) {
                    s.push(x);
                    System.out.println("pushed:"+x);
                    x+=10;
                }
            }catch(StackException ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Top most element:" +s.peek());
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.print(s.pop() + " ");
                }
            }catch(StackException ex){
                System.out.println();
                System.out.println(ex.getMessage());
            }
            }
        }


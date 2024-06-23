package Dsa.DynamicStack;

public class UseStack {
    public static void main(String[] args) {
        Stack st=new Stack();
        System.out.println("Size of stack:"+st.size());
        System.out.println("Is stack empty:"+st.isEmpty());
        st.push(10);
        System.out.println("Is stack empty:"+st.isEmpty());
        System.out.println("Size of stack:"+st.size());
        st.push(20);
        st.push(30);
        System.out.println("Size of stack:"+st.size());
        System.out.println("Peek Element:"+st.peek());
        System.out.println("Popped:"+st.pop());
        System.out.println("Size of stack:"+st.size());
        System.out.println("Popped:"+st.pop());


    }
}

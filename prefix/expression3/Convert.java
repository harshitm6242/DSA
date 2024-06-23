package Dsa.prefix.expression3;

import java.util.Stack;

public class Convert {
    private String prefix,infix;

    public Convert(String infix) {
        this.infix = infix;
        prefix="";
    }
    public void toPreFix(){
        Stack<Character> st= new Stack<>();
        for (int i=infix.length()-1;i>=0;i--){
            char ch=infix.charAt(i);
            if(ch==')')
                st.push(ch);
            else if(ch=='('){
                while(st.peek()!=')'){
                    prefix+=st.pop();
                }
                st.pop();
            }

            if(isOperand(ch)==true){
                prefix=prefix+ch;
            }
            else{
                while(st.empty()==false){
                    if(precedence(ch)>=precedence(st.peek()))
                        break;
                    prefix+=st.pop();
                }st.push(ch);
            }
        }
        while(st.empty()==false)
            prefix+=st.pop();
        StringBuilder sb=new StringBuilder(prefix);
        sb.reverse();
        prefix=sb.toString();
    }
    public boolean isOperand(char ch){
        if(ch>=65&&ch<=90||ch>=97&&ch<=122||ch>=48&&ch<=57)
           return true;
        return false;

    }
    public int precedence(char op){
       if(op=='$')
           return 3;
       else if(op=='/'||op=='*'||op=='%')
           return 2;
       else if(op=='+'||op=='-')
           return 1;
        else
           return 0;
    }

    @Override
    public String toString() {
        return "Prefix=" + prefix +", infix=" + infix ;
    }
}

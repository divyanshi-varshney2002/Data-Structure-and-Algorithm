package Stack;

import java.util.*;
public class pretoinfix {
    public static boolean isop(char c)
    {
        if(c=='*'||c=='+'||c=='-'||c=='/')
            return true;
        else
            return false;
    }
    public static String convert(String s)
    {
        Stack<String> st=new Stack<>();
        int l=s.length();
        for (int i = l-1; i >=0; i--) {
            char c=s.charAt(i);
            if(isop(c))
            {
                String op1= st.pop();
                String op2= st.pop();
                String temp ="("+op1+c+op2+")";
                st.push(temp);
            }
            else
                st.push(c+"");
        }
        return st.pop();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        System.out.println(convert(s));
    }
}

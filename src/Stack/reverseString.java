package Stack;

import java.util.*;

public class reverseString {
    public static String reverse(String s)
    {
        int l=s.length();
        String sr="";
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < l; i++) {
            st.push(s.charAt(i));
        }
        for (int i = 0; i <l ; i++) {
            char ch= st.pop();
            sr=sr+ch;
        }
        return sr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s));
    }
}

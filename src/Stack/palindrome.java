package Stack;

import java.util.*;
public class palindrome {
    public static int palindrom(char s[])
    {
        int i,mid=s.length/2;
        Stack<Character >st=new Stack<>();
        for(i=0;i<mid;i++){
            st.push(s[i]);
        }
        if(s.length%2!=0)
            i++;
        while(i<s.length){
            char e=st.pop();
            if (e!=s[i])
                return 0;
            i++;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        char str[]=s.toCharArray();
        if(palindrom(str)==1)
            System.out.println("true");
        else System.out.println("false");
    }
}

package Recursion;

import java.util.Scanner;
public class factorial {
    public static int facto(int a)
    {
        if(a==1||a==0)
            return 1;
        else
            return a*facto(a-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(facto(a));
    }
}


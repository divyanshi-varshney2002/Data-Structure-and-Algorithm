package FirstOne;

import java.util.*;
public class Sum
{
    Scanner sc=new Scanner(System.in);
    void func()
    {
        int var1=sc.nextInt();
        int var2=sc.nextInt();
        int res=var1+var2;
        System.out.println("total : "+res);
    }
    public static void main(String args[])
    {
        Sum obj= new Sum() ;
        obj.func();
    }
}


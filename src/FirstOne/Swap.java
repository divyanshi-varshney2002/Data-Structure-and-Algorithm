package FirstOne;

import java.util.Scanner;
public class Swap
{
    void func()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1st value:");
        int var1 = sc.nextInt();

        System.out.println("enter 2nd value:");
        int var2 = sc.nextInt();

        System.out.println("value of variable1==="+var1);
        System.out.println("value of variable2==="+var2);

        //Swapping
        int temp=var1;
        var1=var2;
        var2=temp;

        System.out.println("------After Swapping-----");
        System.out.println("value of variable1==="+var1);
        System.out.println("value of variable2==="+var2);

    }
    public static void main(String args[])
    {
        Swap obj=new Swap();
        obj.func();
    }
}


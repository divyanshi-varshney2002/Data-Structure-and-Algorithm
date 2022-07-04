package Stack;

import java.util.*;
public class StackDemo {
    int ar[];
    int top;
    StackDemo()
    {
        ar =new int[5];
        top=-1;
    }
    void push()
    {
        if(top==ar.length-1)
        {
            System.out.println("Stack full");
        }
        else
        {
            System.out.println("enter data:");
            Scanner sc=new Scanner(System.in);
            int data=sc.nextInt();

            top=top+1;
            ar[top]=data;
            System.out.println("data inserted.....");
        }
        //System.out.println("push fn is working");
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack empty");
        }
        else
        {
            System.out.println("deleted...."+ar[top]);
            top=top-1;
        }
        //System.out.println("pop fn is working");
    }
    void traverse()
    {
        if(top==-1)
        {
            System.out.println("Stack empty");
        }
        else
        {
            System.out.println("----------stack element----------");
            for(int i=top;i>=0;i--)
            {
                System.out.println(ar[i]);
            }
        }
        //System.out.println("display fn is working");
    }
    public static void main(String args[]){
        StackDemo obj=new StackDemo();
        while(true)
        {
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");

            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }
    }
}
/*
stack concept
lifo technique (last in first out)
--in a stack insertion and deletion from a single end end only that is called "top"
    top= -1                 ------initial
    if(top==ar.length-1)    -----stack full/overflow
    if(top==-1)             ------stack empty/underflow
stack operation:
push()-insert
    inserting a data in stack
    top will be increment by1
    top=top+1
pop() -delete
    deleting a data in stack
    top will be decrement by1
    top=top-1
traverse()/view() -display
    displaying a data from a stack top to 0
 */

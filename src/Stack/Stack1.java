package Stack;

public class Stack1
{
    static final int max=1000;
    int top;
    Stack1()
    {
        top=-1;
    }
    int a[]=new int[max];
    boolean isEmpty()
    {
        if(top<0)
            return true;
        else
            return false;
    }
    boolean push(int x)
    {
        if(top>=max-1)
        {
            System.out.println("stack overflow");
            return false;
        }
        else
        {
            top++;
            a[top]=x;
            System.out.println("Successfully inserted");
            return true;
        }
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
        {
            int x=a[top];
            top--;
            return x;
        }
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
        {
            int x=a[top];
            return x;
        }
    }
    public static void main(String args[])
    {
        Stack1 obj = new Stack1();
        System.out.println(obj.isEmpty());
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}

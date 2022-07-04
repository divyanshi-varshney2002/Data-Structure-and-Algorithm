package Queue;

import java.util.*;
public class CircularQueue
{
    int ar[];
    int Front,Rear;
    CircularQueue()
    {
        ar=new int[5];
        Front=-1;
        Rear=-1;
    }
    void insert()
    {
        if((Front==0&&Rear==ar.length-1)||(Rear+1==Front))
        {
            System.out.println("Circular Queue Full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc=new Scanner(System.in);
            int data=sc.nextInt();

            if(Front==-1)
            {
                Front=0;
            }
            if(Rear<ar.length-1)
            {
                Rear=Rear+1;
                ar[Rear]=data;
            }
            else if(Rear==ar.length-1&&Front!=0)
            {
                Rear=0;
                ar[Rear]=data;
            }
            System.out.println("data inserted......");
        }
    }
    void delete()
    {
        if(Front==-1)
        {
            System.out.println("Singly Queue Empty");
        }
        else
        {
            System.out.println("deleted...."+ar[Front]);
            if(Front==Rear)
            {
                Front=-1;
                Rear=-1;
            }
            else if(Front<Rear)
            {
                Front=Front+1;
            }
            else if(Front==ar.length-1)
            {
                Front=0;
            }
        }
    }
    void traverse()
    {
        if(Front==-1)
        {
            System.out.println("Circular Queue Empty");
        }
        else
        {
            if(Front<=Rear)
            {
                for(int i=Front;i<=Rear;i++)
                {
                    System.out.println(" "+ar[i]);
                }
            }
            else if(Front>Rear)
            {
                for(int i=Front;i<=ar.length-1;i++)
                {
                    System.out.println(" "+ar[i]);
                }
                for(int i=0;i<=Rear;i++)
                {
                    System.out.println(" "+ar[i]);
                }
            }
        }
    }
    public static void main(String args[])
    {
        CircularQueue obj=new CircularQueue();
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");

            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
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

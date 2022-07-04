package LinkedList;

import java.util.*;
class Node2
{
    int rollno;
    Node2 next;
    Node2 previous;
}
public class DoublyLinkedList
{
    Node2 START;
    DoublyLinkedList()
    {
        START=null;
    }
    void insert()
    {
        System.out.println("Enter your roll no.");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        Node2 nn=new Node2();
        nn.rollno=data;
        nn.next=null;
        nn.previous=null;

        if(START==null)
        {
            START=nn;
        }
        else
        {
            Node2 current=START;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=nn;
            nn.previous=current;
        }
        System.out.println("data inserted.....");
        //System.out.println("insert fn is working");
    }
    void delete()
    {
        if(START==null)
        {
            System.out.println("Doubly Linked List empty");
        }
        else
        {
            System.out.println("deleted: "+START.rollno);
            if(START.next==null)
            {
                START=null;
            }
            else
            {
                START=START.next;
                START.previous=null;
            }
        }
        //System.out.println("delete fn is working");
    }
    void traverse()
    {
        if(START==null)
        {
            System.out.println("Doubly Linked List empty");
        }
        else
        {
            Node2 current;
            for(current=START;current!=null;current=current.next)
            {
                System.out.print(current.rollno+"   ");
            }
        }
        //System.out.println("traverse fn is working");
    }
    public static void main(String args[])
    {
        DoublyLinkedList obj=new DoublyLinkedList();
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

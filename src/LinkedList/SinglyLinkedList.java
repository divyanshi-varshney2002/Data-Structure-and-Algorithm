package LinkedList;


import java.util.*;
class Node
{
    int rollno;
    Node next;
}
public class SinglyLinkedList
{
    Node START;
    SinglyLinkedList()
    {
        START=null;
    }
    void insert()
    {
        System.out.println("Enter your roll no.");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        Node nn=new Node();
        nn.rollno=data;
        nn.next=null;

        if(START==null)
        {
            START=nn;
        }
        else
        {
            Node current=START;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=nn;
        }
        System.out.println("data inserted.....");
        //System.out.println("insert fn is working");
    }
    void delete()
    {
        if(START==null)
        {
            System.out.println("List empty");
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
            }
        }
        //System.out.println("delete fn is working");
    }
    void traverse()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            Node current;
            for(current=START;current!=null;current=current.next)
            {
                System.out.print(current.rollno+"   ");
            }
        }
        //System.out.println("traverse fn is working");
    }
    public static void main(String args[])
    {
        SinglyLinkedList obj=new SinglyLinkedList();
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
/*
data storage
static                                  dynamic
*size willbe decide at the compile time *run time
*array                                  *linked list
==============================================================
 Linked List------concept of the dynamic memory allocation
_____________________________________________________________
Example:
static memory allocation:
int ar[500];
year    add     used    free
2021    100     100     400
2022    150     250     250
2023    80      330     170
2024    170     500     0
        1       full    no space/error
_____________________________________________________________
array implementation:
Vabiable name/index a[0]    a[1]    a[2]    a[3]    a[4]
value/data          101     201     301     401     501
=======================================================================
linked list representation:
_______________________________________________________________
----singly linked list representation
variable name       A           B           C           D           E
value/data          101         201         301         401         501
self address        A001        A002        A003        A004        A005
next address        B(A002)     C(A003)     D(A004)     E(A005)     NULL
____________________________________________________________
Linked list
**In a linked list first node always called a"START NODE".
**In a linked list last node.next always contains "NULL" address.
___________________________________________________________________
type
#Singly linked list(forward only)
    Node: its a user defined variable which contains two parts(data&address)
        1.DATA      :contains the data/values
        2.ADDRESS   :contains the address of the next node
#doubly linked list(Forward & reverse)
    Node: its a user defined variable which contains three parts(data&address(NEXT&PREVIOUS)
        1.DATA              :contains the data/values
        2.NEXT ADDRESS      :contains the address of the next node
        3.PREVIOUS ADDRESS  :contains the address of the previous node

----doubly linked list representation
variable name       A           B           C           D           E
value/data          101         201         301         401         501
self address        A001        A002        A003        A004        A005
next address        B(A002)     C(A003)     D(A004)     E(A004)     NULL
previous address    NULL        A(A001)     B(A002)     C(A003)     D(A004)
 */


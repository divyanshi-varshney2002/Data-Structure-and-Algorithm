package LinkedList;

import java.util.Scanner;

class RotateLinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void rotate(int k)
    {
        if (k == 0)
            return;
        Node current = head;
        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }
        if (current == null)
            return;
        Node kthNode = current;
        while (current.next != null)
            current = current.next;
        current.next = head;
        head = kthNode.next;
        kthNode.next = null;
    }
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        RotateLinkedList llist = new RotateLinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of linked list");
        int l=sc.nextInt();
        System.out.println("enter elements");
        for (int i = 0; i <l; i++)
            llist.push(sc.nextInt());
        System.out.println("Given list");
        llist.printList();
        System.out.println("enter no. of rotation");
        int k=sc.nextInt();
        llist.rotate(k);
        System.out.println("Rotated Linked List");
        llist.printList();
    }
}


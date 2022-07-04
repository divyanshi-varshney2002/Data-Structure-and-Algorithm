package Searching;

import java.util.Scanner;

public class LinearSearching {
    public static int lsearch(int arr[],int x)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to search:");
        int x=sc.nextInt();
        if(lsearch(arr,x)==-1)
            System.out.println("element not found....");
        else
            System.out.println("element found at index "+(lsearch(arr,x)+1));
    }
}

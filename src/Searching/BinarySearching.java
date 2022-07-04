package Searching;

import java.util.Scanner;

public class BinarySearching {
    public static void bsearch(int arr[],int first,int last,int key){
        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]==key) {
                System.out.println("element found at index" + (mid+1));
                break;
            }
            else if(arr[mid]<key)
                first=mid+1;
            else
                last=mid-1;
            mid=(first+last)/2;
        }
        if(first>last)
            System.out.println("element not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to search:");
        int key = sc.nextInt();
        bsearch(arr,0,arr.length-1,key);
    }
}

package Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    public static void bsort(int arr[],int n){
        for (int i=0;i<n;i++){//pass loop
            for(int j=0;j<n-i-1;j++){//comparison loop
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println( "enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        bsort(arr,n);
        System.out.println("sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

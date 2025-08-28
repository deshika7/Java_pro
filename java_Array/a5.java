package java_Array;

import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print(sum+" ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
            
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}

//Write a program to accept the elements into an array and replace every element in the array with the sum of left side element
package java_Array;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}


//Write a program to accept the elements into an array and display the array from right to left
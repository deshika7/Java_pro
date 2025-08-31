package java_string;

import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int c=0;
        for(int i=0;i<a.length();i++){
            c++;
        }
        System.out.println(c);
        sc.close();
    }
    
}
/*
 Write a program to find the length of the string without using in-built function

Input Format

Accept string as an input

Constraints

NIL

Output Format

Print the count of the string

Sample Input 0

i like apple
Sample Output 0

12
 */
package java_string;

import java.util.Scanner;

public class s9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String r="";
        for(int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
            r=r+ch;
        }
        System.out.println(r);
        sc.close();
    }
    
}
/*
 Write a program to reverse a given string without using in-built functions

Input Format

Accept the string as input

Constraints

NIL

Output Format

Print the reverse of the string

Sample Input 0

apple
Sample Output 0

elppa
 */
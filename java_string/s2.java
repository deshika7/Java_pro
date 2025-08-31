package java_string;

import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int c=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }

}
/*
 Write a program to count the special characters in the given string

Input Format

Accept the string as an input

Constraints

NIL

Output Format

Print the count of the special characters.

Sample Input 0

togy@#123
Sample Output 0

2
 */
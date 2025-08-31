package java_string;

import java.util.Scanner;

public class s4 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=a.replaceAll("[aeiouAEIOU]"," ");
        System.out.println(b);
        sc.close();
    }

}
/*
 Write a program to replace all vowels with spaces

Input Format

Accept string as an input

Constraints

NIL

Output Format

Print the replaced string

Sample Input 0

Replace all vowels 
Sample Output 0

R pl c   ll v w ls 
 */
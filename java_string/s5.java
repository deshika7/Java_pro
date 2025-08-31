package java_string;

import java.util.Scanner;

public class s5 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        char b=sc.next().charAt(0);
        sc.nextLine();
        String a=sc.nextLine();
        
        if(a.contains(String.valueOf(b))){
            System.out.println("Present");
        }
        else 
            System.out.println("Not Present");
        sc.close();
    }
    

}
/*
Write a program to search for a character in a string

Input Format

Accept string as an input

Constraints

NIL

Output Format

Present / Not Present

Sample Input 0

p
apple
Sample Output 0

Present
Sample Input 1

f
Myslate
Sample Output 1

Not Present
 */

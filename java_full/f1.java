package java_full;

import java.util.Scanner;

public class f1 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=sc.nextInt();
        double c=sc.nextDouble();
        char d=sc.next().charAt(0);
        double t = Math.floor(c * 100) / 100.0;

        System.out.println("Name: "+a);
        System.out.println("Age: "+b);
        System.out.println("CGPA: "+t);
        System.out.println("Grade: "+d);
        sc.close();
    }
    
}


/*
 Rajeev
20
8.6467
B
Sample Output 0

Name: Rajeev
Age: 20
CGPA: 8.64
Grade: B
Sample Input 1

Meera
18
9.123
A
Sample Output 1

Name: Meera
Age: 18
CGPA: 9.12
Grade: A
 */

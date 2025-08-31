package java_full;

import java.util.Scanner;

public class f5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        int a1=(int)a;
        int a2=(int)Math.ceil(a);
        int a3=(int)Math.floor(a);
        System.out.println(a1+"\n"+a2+"\n"+a3);
        sc.close();
    }
    
}


/*
 54.5
Sample Output 0

54
55
54
Sample Input 1

66.7
Sample Output 1

66
67
66
 */

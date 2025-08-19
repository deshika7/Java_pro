package java_loops;

import java.util.Scanner;

public class l8 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2==0){
                sum=sum+i;
                
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
    
                    
                    
                
                    
              
        


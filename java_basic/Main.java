// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ele=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<k;j++){
                if(arr[i]==ele[j]){
                    break;
                }
            }
            if(j==k){
                ele[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(ele[i]+" ");
        }
        
    }
}
    

    import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // O(n log n)

        System.out.print(arr[0] + " "); // print first element

        for(int i = 1; i < n; i++) {
            if(arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
    

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Remove duplicates (preserve order)
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

*/
package java_basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int flag = 0;
            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1; 
                    break;
                }
            }

            if (flag == 0) {
                System.out.print(arr[i] + " ");
            }
        
        }
        sc.close();
    }
}

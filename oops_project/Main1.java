import java.util.*;
class Main1{
class Node {
    String name;
    int num;
    Node next;

    Node(String name, int num) {
        this.name = name;
        this.num = num;
        this.next = null;
    }
}
Node start=null , end=null;

void insert(String name, int num) {
    Node newNode = new Node(name, num);
    if (start == null) {
        start = newNode;
        end = newNode;
    } else {
        end.next = newNode;
        end = newNode;
    }
}

void display() {
    Node c = start;
    while (c != null) {
        System.out.println();
        System.out.println("Name: " + c.name);
        System.out.println("Price: " + c.num);
        System.out.println();
        c = c.next;
    }
}
void sum(){
    int sum = 0;
    Node c = start;
    while (c != null) {
        sum += c.num;
        c = c.next;
        }
System.out.println("Total sum: " + sum);

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main1 m = new Main1();
    while(true){
    System.out.println(" 1.Add \n 2.Display \n 3.sum \n 4.exit");
    int op=sc.nextInt();
    sc.nextLine();
    switch (op) {
        case 1:
            System.out.println("Enter the food name: ");
            String na=sc.nextLine();
            System.out.println("Enter price: ");
            int p=sc.nextInt();
            m.insert(na,p);
            break;
        case 2:
            m.display();
            break;
        case 3:
            m.sum();
            break;
        case 4:
            System.out.println("Exiting...");
                sc.close();
                return;
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
    }
    }
}
}

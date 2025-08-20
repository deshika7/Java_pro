import java.util.*;
abstract class Demo {
    private String name;
    private String dept;
    private int yr;
    public Demo(String name, String dept, int yr) {
        this.name = name;
        this.dept = dept;
        this.yr = yr;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public int getYr() {
        return yr;
    }
    public abstract void getDetails();
}

class Info extends Demo {
    public Info(String name, String dept, int yr) {
        super(name, dept, yr);
    }

    @Override
    public void getDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDept());
        System.out.println("Year: " + getYr());
    }
}

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Info> de = new ArrayList<>();
       System.out.println("Welcome to Student Section");
       while (true) {
        System.out.println("\n1.Add");
        System.out.println("2.View");
        System.out.println("3.status");
        System.out.println("4.Exit");
        int ch = sc.nextInt();
        sc.nextLine();
        switch (ch) {
            case 1:
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                System.out.print("Enter Year: ");
                int year = sc.nextInt();
                sc.nextLine();
                de.add(new Info(name, dept, year));
                break;
            case 2:
                System.out.println("\nDetails:");
                for(Demo d:de){
                    d.getDetails();
                }
                break;

            case 3:
             if (de.isEmpty()) {
                        System.out.println("No students found!");
                        break;
                    }
                else {
                    System.out.println("Total students available: " + de.size());
                    break;
                }
                
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

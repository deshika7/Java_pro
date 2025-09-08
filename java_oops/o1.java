package java_oops;
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}
class bird extends Animal{
    void bark(){
        System.out.println("____");
    }
}


public class o1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.bark();
        d.eat();
        bird b = new bird();
        b.bark();
        b.eat();
        
    }
}

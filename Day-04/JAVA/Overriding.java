package JAVA;
 class Animal {
    String name = "animal";
    int age = 15;

    public void eat () {
        System.out.println("Animal Eating");
    }
 }

class Dog extends Animal {

    public void sleep () {
        System.out.println("Dog is sleeping");
    }
 }
public class Overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println(d.name+" " + d.age);
        d.sleep();
        a.eat();
    }
}

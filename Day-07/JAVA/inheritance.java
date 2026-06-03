class Animal {
    void eat () {
        System.out.println("Animal is eating");
    }
    String name = "Animal";
}

class Dog extends Animal{
    void sound () {
        System.out.println("Dog Barks");
    }

    
} 

public class inheritance {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        Dog d = new Dog();
        System.out.println("Name is: "+a.name);
        d.eat();
        d.sound();
        
    }
}

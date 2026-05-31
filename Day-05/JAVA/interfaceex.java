interface animal {
    public void size();
    public void food();
}

interface creature {
    public void isAlive();
}

class dog implements animal {
    public void size(){
        System.out.println("The dog is Medium Size");
    }

    public void food(){
        System.out.println("The dog eats normal food");
    }
}

class human implements animal,creature {
    public void size(){
        System.out.println("The human is little bigger than some dogs");
    }

    public void food(){
        System.out.println("The human eats normal food ");
    }
    public void isAlive(){
        System.out.println("The human can be alive on the earth");
    }
}

public class interfaceex{
    public static void main(String[] args) {
        
        dog d = new dog();
        human h = new human();

        d.size();
        d.food();
        h.size();
        h.food();
        h.isAlive();
    }

    
}
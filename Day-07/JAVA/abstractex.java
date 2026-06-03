abstract class animal{
    void eat(){
        System.out.println("Animal is eating");
    }

    abstract void sleep();
}


class dragon extends animal{
    void isAlive(){
        System.out.println("The dragon is not exist on the earth");
    }
    void sleep(){
        System.out.println("As it doesnot exist on the earth then sleeping will not possible");
    }
}

public class abstractex {
    public static void main(String[] args) {
        dragon d = new dragon();
        d.isAlive();
        d.sleep();
    }
}

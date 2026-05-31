abstract class shape{
    public abstract void faces();

    public void exist(){
        System.out.println("The shape exist physically");
    }
}

    class circle extends shape {
        public void faces(){
            System.out.println("Circle have only one face");
        }

    }
public class ShapeAbstract {
    public static void main(String[] args) {
        circle c = new circle();
        c.faces();
        c.exist();
    }
}

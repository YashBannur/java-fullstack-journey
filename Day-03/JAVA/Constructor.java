public class Constructor {
    
    int id;
    String name;
    String address;

    Constructor(){
        System.out.println("This is default Constructor");
    }

    Constructor(int id){
        System.out.println("This Constructor called when we give id as a variable");
    }

    Constructor(String name){
        System.out.println("This Constructor called when we enter name as variable");
    }

    Constructor(int id ,String address){
        System.out.println("This Constructor is called when we enter id and name as variable ");
    }

    void display(){
        System.out.println("All Constructors are Called");
    }
public static void main(String[] args) {
    Constructor c1 = new Constructor();
    Constructor c2 = new Constructor("Yash");
    Constructor c3 = new Constructor(2);
    Constructor c4 = new Constructor(2, "Bangalore");

    c1.display();
    c2.display();
    c3.display();
    c4.display();
}

}

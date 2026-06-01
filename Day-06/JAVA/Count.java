class Students {
    String name;
    static int count;

    Students(){
        count++;
    }
}

public class Count {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        System.out.println("Students Created: "+Students.count);
    }
}

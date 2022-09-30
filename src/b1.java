import ra.Student;

public class b1 {
    public static void main(String[] args) {
        Student s1 = new Student(111,"Akali");
        Student s2 = new Student(222,"Kat");
        Student s3 = new Student(222,"Dada");

        Student.change();
        s1.display();
        s2.display();
        s3.display();

    }
}
package Homework4;

public class StudentDemo {

    public static void main(String[] args) {
        Student Ivo = new Student("Ivo Iliev", "Pharmacy", 21);

        Student Atanas = new Student();
        Atanas.name = "Atanas Todorov";
        Atanas.subject = "Mathematics";
        Atanas.age = 20;

        Student Todor = new Student("Todoro Haralambiev", "Marketing", 26);

        System.out.println(Ivo.receiveScholarship(4.0, 50));
        System.out.println(Ivo.receiveScholarship(4.0, 50));

        System.out.println();

        Atanas.upYear();
        Atanas.upYear();
        Atanas.upYear();

        System.out.println();

        System.out.println(Todor.receiveScholarship(5.0, 60));
        Todor.upYear();

    }
}

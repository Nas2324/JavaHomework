package Homework5;

import Homework4.Student;

public class College {

    public static void main(String[] args) {

        Student Ivo = new Student("Ivo Iliev", "Pharmacy", 21);
        Ivo.grade = 5.20;

        Student Atanas = new Student();
        Atanas.name = "Atanas Todorov";
        Atanas.subject = "Mathematics";
        Atanas.age = 20;


        Student Todor = new Student("Todoro Haralambiev", "Marketing", 26);
        Todor.grade = 4.80;

        Student Radost = new Student("Radost Milcheva", "Marketing", 21);
        Radost.grade = 5.40;

        Student Milcho = new Student("Milcho Marinov", "Marketing", 22);
        Milcho.grade = 5.60;

        Student Angel = new Student("Angel Marinov", "Marketing", 23);
        Angel.grade = 5.0;

        Student Georgi = new Student("Georgi Chompalov", "Marketing",23);
        Georgi.grade = 5.20;

        Student Eva = new Student("Eva Miteva", "Marketing", 25);

        StudentGroup Marketing = new StudentGroup("Marketing");


        System.out.println(Ivo.toString());

        System.out.println();

        Marketing.addStudent(Ivo);
        Marketing.addStudent(Radost);
        Marketing.addStudent(Atanas);
        Marketing.addStudent(Eva);
        Marketing.addStudent(Georgi);
        Marketing.addStudent(Angel);
        Marketing.addStudent(Todor);
        Marketing.addStudent(Milcho);

        Marketing.printStudentsInGroup();

        String bestStudent = Marketing.theBestStudent();
        System.out.println("The best student is "+ bestStudent);

        Marketing.emptyGroup();

        Marketing.addStudent(Milcho);

        System.out.println(Atanas.receiveScholarship(5, 100));
        Eva.upYear();
        System.out.println(Eva.receiveScholarship(5.40, 150));



























    }
}

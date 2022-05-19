package Homework6;

public class DemoPerson {

    public static void main(String[] args) {
        Person[] arrPerson = new Person[10];

        Person Bobi = new Person("Borislav Popov", 26, true);
        Person Milen = new Person("Milen Georgiev", 17, true);

        NewStudent Desi = new NewStudent("Desislava Ivanova", 20, false, 4.80);
        NewStudent Krasi = new NewStudent("Krasimir Malinov", 21, true, 5.20);

        Employee Mitko = new Employee("Dimitar Kolev",45, true, 110);
        Employee Iva = new Employee("Iva Nikolova", 17, false, 32.5);

        arrPerson[0] = Bobi;
        arrPerson[1] = Milen;
        arrPerson[2] = Desi;
        arrPerson[3] = Krasi;
        arrPerson[4] = Mitko;
        arrPerson[5] = Iva;

//        for (int i = 0; i < arrPerson.length; i++) {
//            if(arrPerson[i] instanceof Employee) {
//                ((Employee) arrPerson[i]).showEmployeeInfo();
//            } else {
//                if (arrPerson[i] instanceof newStudent) {
//                    ((newStudent) arrPerson[i]).showStudentInfo();
//                } else {
//                    if (arrPerson[i] instanceof Person){
//                        arrPerson[i].showPersonInfo();
//                    }
//                }
//            }
//        }

        for(Object arrayItem : arrPerson){
            if(arrayItem instanceof Employee){
                ((Employee) arrayItem).showEmployeeInfo();
            } else {
                if(arrayItem instanceof NewStudent){
                    ((NewStudent) arrayItem).showStudentInfo();
                } else {
                    if(arrayItem instanceof Person){
                        ((Person) arrayItem).showPersonInfo();
                    }
                }
            }
        }



        for (int i = 0; i < arrPerson.length; i++) {
            if(arrPerson[i] instanceof Employee){
                ((Employee) arrPerson[i]).calculateOvertime(2);
            }

        }
    }
}

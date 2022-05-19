package Homework6;

public class Employee extends Person{
    protected double daySalary;

    protected Employee(String name, int age, boolean isMan, double daySalary){
        super(name, age, isMan);
        this.daySalary = daySalary;

    }

    protected void calculateOvertime(double hours){
        double sum;
        if (getAGE() < 18){
            System.out.println(getNAME() + " is not allowed to work overtime!!!");
        }else {
            sum = hours*daySalary*1.5;
            System.out.println(getNAME() + " will recive " + sum + " lv for overtime!");
        }

    }

    protected void showEmployeeInfo(){

        System.out.println(getNAME() + " is " + getAGE() + " years old ." + "Is man - " + isMan + ". " + getNAME() + "'s day salary is " + daySalary);
    }







}

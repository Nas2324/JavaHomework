package Homework6;


public class Person {

    final private String NAME;
    final private int AGE;
    boolean isMan;


    protected Person(String name, int age, boolean isMan){
        this.NAME = name;
        this.AGE = age;
        this.isMan = isMan;

    }

    protected void showPersonInfo(){
        System.out.println(NAME + " is " + AGE + " years old ." + " Is man - " + isMan) ;
    }
    protected String getNAME(){
        return NAME;
    }

//    public void setName(String name) {
//        this.name = name;
//    }


    protected int getAGE(){
        return AGE;
    }

//    public void setAge(int age) {
//         this.age = age;
//    }

}

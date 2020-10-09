package oop.inheritance;

/*
    Inheritance Demonstration

        Person is the supper class
        Employee is the sub class.

        An Employee <IS A> Person.

 */
public class Person {

    private String name;
    private int age;
    private String gender;

    /*
    //Sample constructor to override the default constructor.

    public Person(String name) {
        System.out.println("Person constructor #2");
    }
     */

    public void iAm(){
        System.out.println("I am a PERSON");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
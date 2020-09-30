package oop.inheritance;

public class InheritanceTester {

    public static void main(String[] args){

        /* Note that when we create a new instance of a subclass, it's going to make a call to the superclass's
        constructor before it executes the subclass's constructor. */
        Employee employee = new Employee();
        employee.setName("Angie");
    }

}
package oop.objects;

/*
    Objects

        It's a class that represents something. It's meant to be re-utilized so it would hold common fields and methods
        to the "something" it represents.

    Exercise: Exercise Name

        Create a "Rectangle" object, include common fields, methods and a constructor. Then use HomeAreaCalculator
        class to instantiate the "Rectangle" object.

        Exercise from TAU's Java Programming course by Angie Jones. Chapters 6a and 6b.
        https://testautomationu.applitools.com/java-programming-course/

 */

public class Rectangle {

    //declare global variables. Also known as "fields".
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;

    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public double calculateArea(){
        return length * width;
    }

}

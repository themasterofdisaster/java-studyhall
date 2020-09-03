package basics;
// ^ The line above is the "Package Declaration". If your java file is inside a package, the first line must declare the
// name of the package.

//To make comments in a java class, add double dash.

public class HelloWorld {
    // ^ "Class declaration"
    // The words in color orange are reserved words and we can't use those words to name the classes/variables the we create

    public static void main(String arg[]){
    // ^ default java method. When this class is executed the main method will be the one first executed.
        // it is the starting point of the program, it has to be defined just like this.

        System.out.println("Hello World!");

    }
}

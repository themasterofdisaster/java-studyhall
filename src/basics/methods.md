## Methods 

### Parts of a Method

    public static void printHelloWorld(){
        System.out.println("Hello World!");
    }

The very first line in the method is called a header: public static void printHelloWorld(){

The word "public" is the access modifier. Access modifiers indicate who is allowed access to use this method. public 
means any code from any class can use this method. Other access modifiers include private and protected.

The next part of the header, the word "static", is a non-access modifier. This includes static, final, abstract, and synchronized. 

Next is "void", this is the return type. This indicates the data type of the value that this method will return back 
to the code that calls it. Every method is required to specify a return type. In the above example, we don't want the 
method to return any value so we use "void". 

The next part in the method header is the method's name: printHelloWorld
By convention, the name should begin with the verb which indicates what the method does.
In the case the method returns a boolean, then by convention the method name should ask a question: isSumNegative

After the method's name we can see a set of parentheses. These are required. They are used to hold the data that is to 
be passed to the method upon calling it. This is known as the "Parameter list" and it's a comma separated list. In the 
example above, the method is not required any data so we leave them empty. 

After the name and parentheses, we see a curly brace being open {, then everything that follows up until the 
closing curly brace }, it's method's body. 

Method signature: Consists of the name of the method and the method's parameter list. A method signature must be unique
within it's class. 
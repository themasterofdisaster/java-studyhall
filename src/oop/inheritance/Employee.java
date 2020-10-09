package oop.inheritance;

public class Employee extends Person {

    private String employeeId;
    private String title;

    //This is Employee's default constructor.
    public Employee(){

        /*
            When a new instance of "Employee" is created, the default Person constructor is going to be called before
            the Employee's constructor. If we want to force a specific constructor of the supper class to be called
            instead of the default one, you need to specify it.

            We call into the desired constructor by calling the "super" constructor and passing the arguments
            corresponding to the constructor we want to call.

            '''
            super("angie")
            '''

            Explicit Calls to Superclass Constructors Must Come First
                Note that if you're going to make an explicit call to the superclass's constructor, then that call must
                be the very first line of the subclass's constructor.
         */

        System.out.println("In Employee default constructor");
    }

    //Override of a method. We inherit the method iAM() from Person, but in this case we want to modify what it does.
    //We use the same method name and signature and modify the code within it to something appropriate for "Employee".
    //Use the @Override annotation follow best practices
    @Override
    public void iAm(){
        System.out.println("I am an EMPLOYEE");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
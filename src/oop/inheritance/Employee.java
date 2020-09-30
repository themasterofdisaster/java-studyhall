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
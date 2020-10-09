## Inheritance

Inheritance is where one class becomes an extension of another class, therefore inheriting the members of that class.

### constructors in inheritance

- A superclass's constructor is run before the subclass's constructor.

- Explicit calls can be made to superclass's constructor from one of the subclass's constructors by using super().

- Explicit calls to the superclass's constructor must be the first statement in the subclass's constructor.

- If the superclass does not have a default constructor, the subclass must explicitly call one of its other constructors.

### Limiting Access in Inheritance 

What is and is not inherited from the supper class to the sub class? 

- Constructors are not inherited. 
- Public and protected members (methods and fields) are inherited. 
- Private members are not inherited. 
- Final methods are inherited but cannot be overridden. 
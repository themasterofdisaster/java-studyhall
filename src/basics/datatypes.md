## DATA TYPES

### Primitive Data Types

- byte
- short
- int
- long
- float
- double
- boolean
- char

#### Wrapper Classes
A wrapper class is an object with convenient methods to be re-utilized which are relevant to the data type. 
There are wrapper classes for each of the primitive data types.

- Byte
- Short
- Integer
- Long
- Float
- Double
- Boolean
- Character

### String

A String is not a primitive data type, and it is neither a wrapper class. 
A String is an object and it's a sequence of characters. But much like the wrapper classes, the String class provides 
a lot of helpful methods for dealing with them.

### Type Inference: "var"

In Java version 10, they added support for for type inference. This means we can declare a 
variable as var and Java will infer the data type based on what is assigned to the variable.

#### Rules 

Type inference variables are only allowed for local variables. You cannot use var for declaring a global variable.

You must initialize these variables at the time of declaration, otherwise, the compiler is unable to infer what the 
data type should actually be.

Type inference is not allowed in the headers of methods or constructors. You must still explicitly declare the data 
type of parameters as well as the return types of methods.
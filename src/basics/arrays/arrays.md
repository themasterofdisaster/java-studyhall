## Arrays

Declaration of an array:  

    int[] lottoTicket = new int[6]
    
int - the first part is the data type that the array holds and while the array is capable of holding multiple values, all values must be of the same data type

[] - the square brackets indicate that this is not just an int data type, but this will be an array of “ints”. The bracket can appear after the data type or after the variable name itself

lottoTicket - speaking of name, that's the next part of the declaration. We name arrays just as we would any other variable

= - the name is followed by an equal sign

new - and then we use the new keyword

int - followed by the data type again

[6] - followed by a number inside of the brackets. This number inside of the brackets represents the length of the array, meaning how many values can this array store. Once the length is declared, it's fixed — meaning it cannot be lengthened to hold more values.


### How to get a array's size? 

.length can be used 
for int[], double[], String[] 

    int size = lottoTicket[].length;

For long arrays 

    ar.length;

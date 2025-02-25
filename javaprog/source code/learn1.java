public class learn1 {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}
/*
 1.public keyword allows programmer or system to access the the data inside the class from anywhere;inside or outside the class.

 2.static keyword allows programmer to access the method directly through class without the need of creating an 
   object(instance of class).

 3.void keyword is used to declare a method which does not return any value.

 4.main method is the entry point of the program.

 5.String[] args is the array of string which is passed as a command line argument to the main method.

 5.System.out.println() method is used to print the output on the console.

 6. non addition of static keyword to any method requires an object to be created to access the code inside the method.
    for eg:
     public class learn21 {
    // Main method - Entry point for the program
    public static void main(String[] args) {
        // Calling the static method from the same class
        System.out.println("Hello World from static method in Learn1");
        greeting();
        
    }

    // Non-static method - Needs an object to be called
    public void hello() {
        System.out.println("Hello World using object in Learn1");
    }

    // Static method - Can be called without an object
    public static void hi() {
        System.out.println("Hello World using static method in Learn1");
    }
    public static void greeting() {
        // Create an object of Learn1 to call the non-static method 'hello'
        learn21 obj = new learn21();
        obj.hello(); // Calling non-static method on object 'obj'

        // Calling static method directly using the class name
        learn21.hi(); // Calling static method 'hi' from Learn1 class
    }
}
 */
/*
  that gives an output :
  Hello World from static method in Learn1
Hello World using object in Learn1
Hello World using static method in Learn1

Class - A class is a blueprint or a template for creating objects. It defines the properties and behaviors of objects of that class.

Object - An object is an instance of a class. It is a run-time entity that has state and behavior.

 */
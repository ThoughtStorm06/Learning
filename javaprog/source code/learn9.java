/*
 *Methods in java :
 <access modifier> <return type> <method name> (<parameter list>) {
 // method body
 }

 access modifier- public, private, protected.
 return type- void, int, double, float, char, String, etc.
 method name- any name
 parameter list- list of parameters separated by comma
 method body- code to be executed.

 static keyword is used for a method to be called without creating an object.or, rather to create a class method.
 */
public class learn9 {
    public static void main(String[] args) {
        fun();//static method can be called without creating an object.
        learn9 obj = new learn9(); //creating an object cuz greeting method is an instance of class an not a static method.
        obj.greeting(); //calling the method using the object.
    }
    static void fun() {
        System.out.println("Hello World!");
    }
    void greeting() {
        System.out.println("Hello World!");
    }
}//this  will print hello world.

/*
--> Scope of variables:
 Scope of a variable is the portion of a program where the variable is accessible.
The scope of a variable is determined by the place where it is declared.

A. Method Scope
Definition: Variables declared inside a method are accessible only within that method. These variables are also known as local variables.
Lifecycle: The variable is created when the method is invoked and destroyed when the method finishes execution.

B. Loop Scope
Definition: Variables declared inside a loop are accessible only within the loop block.
Lifecycle: The variable exists only while the loop is executing.

C. Block Scope
Definition: Variables declared inside a pair of curly braces {} are accessible only within that block.
Lifecycle: The variable exists only within the block.

D.Static Class Scope
Initialization: Static members are initialized when the class is loaded.
Access: They can be accessed without creating an instance of the class.
Lifetime: Their scope and lifetime are tied to the class's lifecycle in the JVM.

 */


 

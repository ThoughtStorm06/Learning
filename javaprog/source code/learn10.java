/*
Shadowing is a technique in which a variable is declared in a block of code and has the same name as a variable declared as a class variable.
 When the block of code is executed, the variable declared in the block of code takes precedence over the class variable. 
 This is known as shadowing.
 */
public class learn10 {
    static int x = 10; // class variable

    public static void main(String[] args) {
        int x = 20; // local variable
        System.out.println(x); // prints 20
        System.out.println(learn10.x); // prints 10
        shadow();
    }

    static void shadow() {
        System.out.println(x); // prints 10
    }
}
//when the scope of variable that shadows class variable is over. value of class variable is restored.
// if u wanna use the class variable then use the <class name>.<varname> . this allows u to access the data of class variable, 
//even if the local variable shadows it. 
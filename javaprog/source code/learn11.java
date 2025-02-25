//variable arguments
/*
 variable arguments are used to pass an unknown  number of arguments of same type  to a method.
 --> "<data type>...<variable name> "  ; this is the syntax for variable arguments.
 the variable arguments are onlu used in the last parameter of the method.
 they are used in :
 1. instance methods
 2. static methods
 3. constructor
 4. lambda expressions
 */
import java.util.Arrays;
public class learn11 {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5);
        stud("Ram", 1, 2, 3, 4, 5);
    }
    static void fun(int...v) {
        System.out.println(Arrays.toString(v));
    }
    static void stud(String name, int...marks) {// if int ..marks was the first parameter, there would be an error.
        System.out.println("Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
    }
}
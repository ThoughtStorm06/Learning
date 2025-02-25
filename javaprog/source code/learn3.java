/*
 data types define the type of data a variable can hold. Java is a statically-typed language, meaning the type of every variable is known at compile-time. There are two categories of data types in Java:

Primitive Data Types: These are basic types that are built into the language.
       byte,short,int,long,float,double,char,boolean

Reference Data Types: These refer to objects and arrays.
       String,Array,Class,Interface,Enum
       reference data type will be covered in other java files.
 */
public class learn3 {
    public static void main(String[] args) {
        byte byteValue = 10;      // -128 to 127
        short shortValue = 30000; // -32,768 to 32,767
        int intValue = 100000;    // -2^31 to 2^31-1
        long longValue = 10000000000L; // Use 'L' for long literals
        float floatValue = 3.14f; // Use 'f' for float literals
        double doubleValue = 3.14159; // Double-precision floating-point
        char charValue = 'A';     // A single character
        boolean boolValue = true; // Boolean value (true or false)

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + boolValue);
    }
}

/*
1.Packages: It is a folder that contains a set of related classe files.
Organize related classes and interfaces
Prevent naming conflicts
Provide access control
 
2.Custom package import:
Use import statement at the top of your file
Example: import com.example.mypackage.MyClass;

3.Import path:
Follows directory structure
Periods separate directories
Example: package com.example.mypackage;

4.Source file and package location:
Should be in the same directory structure
Example: Package: com.example.mypackage File path: src/com/example/mypackage/MyClass.java

5.If not in same directory:
Add the root directory of your package to the CLASSPATH environment variable
This allows Java to find your custom packages
 */

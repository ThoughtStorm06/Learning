//TYPECASTING
/*
  Type casting is a method of converting a value of one data type to another.

  There are two types of type casting:

  Implicit Type Casting: This is done automatically by the compiler.
  Explicit Type Casting: This is done manually by the programmer.

  Implicit Type Casting:
  Implicit type casting is done automatically by the compiler when a smaller data type is assigned to a larger data type.

  Example:
  byte b = 10;
  int i = b; // Implicit type casting

  Explicit Type Casting:
  Explicit type casting is done manually by the programmer when a larger data type is assigned to a smaller data
  type.

  Example:
  int i = 10;
  byte b = (byte) i; // Explicit type casting


****  since, a char is smaller data type than int, it can implicitly be converted to int
example:
  char c = 'A';
  int i = c; // Implicit type casting
  System.out.println(i); // Output: 65
the value of the character 'A' is 65 in the ASCII table. [java uses unicode to represent characters.]

A unicode character is a number that represents a character in a computer's memory. its a universal code that can represent any character in any language.

If you try to cast 300 to a byte, the value will overflow. Java will perform the modulo operation based on the size of the byte type (8 bits), effectively discarding
 the higher-order bits and keeping only the lower bits.

When you cast an integer to a byte, Java will calculate the value modulo 256 (since byte is 8 bits, and 256 = 2^8), then interpret the result as a signed 8-bit integer.
for example : 300  integer too byte gives 44 (300 % 256 = 44).

*/
public class learn5 {
    public static void main(String[] args) {
        
        // Implicit Type Casting (smaller to larger type)
        byte b = 10;
        int i = b; // Implicit casting (byte to int)
        System.out.println("Implicit Type Casting:");
        System.out.println("byte b = " + b);
        System.out.println("int i = b; => i = " + i); // Output: 10

        // Explicit Type Casting (larger to smaller type)
        int x = 300;
        byte y = (byte) x; // Explicit casting (int to byte)
        System.out.println("\nExplicit Type Casting:");
        System.out.println("int x = 300;");
        System.out.println("byte y = (byte) x; => y = " + y); // Output: 44 (300 % 256 = 44)

        // Implicit Type Casting (char to int)
        char c = 'A';
        int charToInt = c; // Implicit casting (char to int)
        System.out.println("\nImplicit Casting char to int:");
        System.out.println("char c = 'A';");
        System.out.println("int charToInt = c; => charToInt = " + charToInt); // Output: 65 (ASCII value of 'A')

        // Demonstrating Unicode value of 'A' using char to int
        System.out.println("\nUnicode value of 'A' in int form:");
        System.out.println("'A' -> " + (int) 'A'); // Output: 65 (Unicode of 'A')
    }
}

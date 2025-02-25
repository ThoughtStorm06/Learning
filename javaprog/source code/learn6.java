/*
Automatic type promotion occurs when an expression involves values of different data types,
and Java automatically promotes the smaller type to a larger type to ensure compatibility and avoid data loss.
This happens according to the Java type promotion hierarchy.

Rules of Promotion in Expressions:
byte, short, and char:
Promoted to int during arithmetic operations.
This is because int is the default type for arithmetic calculations in Java.

int:
If mixed with long, the int is promoted to long.
If mixed with float, the int is promoted to float.
If mixed with double, the int is promoted to double.

long:
If mixed with float, the long is promoted to float.
If mixed with double, the long is promoted to double.

float:
If mixed with double, the float is promoted to double.
 */
public class learn6 {
    public static void main(String[] args) {
        
        // Declare variables with smaller data types
        byte b = 10;      // byte
        short s = 20;     // short
        char c = 'A';     // char
        int i = 100;      // int
        long l = 1000L;   // long
        float f = 3.14f;  // float
        double d = 6.28;  // double
        
        // Perform operations and observe automatic type promotion
        int result1 = b + s;     // byte + short --> promoted to int
        int result2 = b + c;     // byte + char --> promoted to int
        long result3 = i + 100L; // int + long --> promoted to long
        double result4 = i + 10.5; // int + double --> promoted to double
        double result5 = b + s + c + i + l + f + d;
        // Display the results
        System.out.println("result1 (byte + short): " + result1);  // Output: 30
        System.out.println("result2 (byte + char): " + result2);    // Output: 175 ('A' is 65 in Unicode)
        System.out.println("result3 (int + long): " + result3);     // Output: 200
        System.out.println("result4 (int + double): " + result4);   // Output: 110.5
        System.out.println("result5 (all types): " + result5);      // Output: 1204.4200146484375
    }
}

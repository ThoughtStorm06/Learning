public class learn13 {
    public static void main(String[] args) {
        String result = "hello" + 25; // string concatenation can be done using the + operator, with similar or different data types.
        System.out.println(result);  // Output: hello25
        //sring concatenatio with non-primitive data types is called string interpolation.be learnt later in other files.

        //string addition with null
        String str = null;
        try {
            System.out.println("Hello " + str);  // This will not throw a NullPointerException
            System.out.println("Hello ".concat(str));  // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("concat() failed due to null");  // Exception caught
        }
    }
}
// when + is used to concatenate string with null. it converts null to string "null".
//while concat() is used to concatenate string with null. it throws a NullPointerException.
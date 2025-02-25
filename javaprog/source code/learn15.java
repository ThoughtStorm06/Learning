//few codes of referncing data types
import java.util.Arrays;
public class  learn15 {
    public static void main(String[] args) {
        int[] arrr={ 1,2,3,4,5,6,7,8};
        String strr = "Hello";
        str(strr);
        arr(arrr);
        System.out.println(strr);
        System.out.println(Arrays.toString(arrr));
        strr = strr+ "world"; // creates Helloworld data in heap memory and points the variable towards it, and removes its pointer towards Hello. 
        System.out.println(strr); //This is because , the data of string is immutable, and any cahnges results in creation of new data in memory.

    }
    static void arr(int[] a) { // array is passed by reference; and arrays are mutable i.e, its data can be modified. any modification here is reflected in the original variable too.
        a[0] = 10;
    }
    static void str(String a) { // since , string is immutable, any changes to string here creates a new literal(data) in heap memory.
        a = "world";
    }
}
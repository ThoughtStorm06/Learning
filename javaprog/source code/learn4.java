//taking input of few commonly used data type
import java.util.Scanner;
public class learn4 {
    public static void main(String args[]) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter integer:");
        int a = i.nextInt();
        System.out.println("Enter a float numbeer:");
        float b = i.nextFloat();
        System.out.println("Enter a decimal number:");
        double c = i.nextDouble();
        System.out.println("Enter a character:");
        char d = i.next().trim().charAt(0); //trim() removes the whitespace
        char g = i.next().charAt(0); //charAt(0) returns the first character of the string with no removal of white spaces
        System.out.println("Enter a string:");
        String e = i.next();
        System.out.println("Enter a boolean:");
        boolean f = i.nextBoolean();
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+g+" "+f+"\n");
        i.close();
            }
}

//Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, 
//the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the 
//remainder of the integer line (which is empty).

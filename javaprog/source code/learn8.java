/* 

-->switch statement
  switch(expression)
  {
    case value1:
      // code to be executed if the expression is equal to value1
      break;
    case value2:
      // code to be executed if the expression is equal to value2
      break;
    case value3:
      // code to be executed if the expression is equal to value3
      break;
    default:
      // code to be executed if the expression is not equal to any of the values
      break;
  }

   |-The switch statement is used when you want to make a decision based on a single expression and provide an alternative action for each case.
   |-The switch statement is also used when you want to make a decision based on a single expression and provide an alternative action for
   each case.
   |-The break statement is used to exit a switch statement.if not used between the cases then it will execute all the cases after the case 
   which is true.
    */
// use of the placement can be done in a smart way
import java.util.Scanner;
public class learn8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a day between 1 and 7");
        int day = in.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid day");
        //         break;
        // }
        //the above switch can be enhanced using the below switch
        switch (day) {
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7->System.out.println("Sunday");
            default->System.out.println("Invalid day");
        }
        //this allows clean coding and is more readable
        //we can manipulate the code with the way we use break statement too.
        // switch(day) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("Weekday");
        //         break;
        //     case 6:
        //     case 7:
        //         System.out.println("Weekend");
        //         break;
        //     default:
        //         System.out.println("Invalid day");
        //         break;
        // }
        //the above code can also be enhanced in below fashion:
        switch(day) {
            case 1,2,3,4,5->System.out.println("Weekday");
            case 6,7->System.out.println("Weekend");
            default->System.out.println("Invalid day");
        }
        //this allows readability.

        //next concept is nested switch.
        //nested switch is a switch statement inside another switch statement.        
    System.out.println("Enter a category between 1 and 2");
    int category = in.nextInt();
    // switch (category) {
    //     case 1:
    //     System.out.println("Enter item number");
    //     int item = in.nextInt();
    //         switch (item) {
    //             case 1:
    //                 System.out.println("mobile");
    //                 break;
    //             case 2:
    //                 System.out.println("laptop");
    //                 break;
    //         }
    //         break;

    //     case 2:
    //     System.out.println("Enter item number");
    //     int item= in.nextInt();
    //         switch (item) {
    //             case 1:
    //                 System.out.println("chair");
    //                 break;
    //             case 2:
    //                 System.out.println("Table");
    //                 break;
    //         }
    //         break;
    // }
    //above code can be enhanced in below fashion:
    switch (category) {
        case 1->{
            System.out.println("Enter item number");
            int item = in.nextInt();
            switch (item) {
                case 1->System.out.println("mobile");
                case 2->System.out.println("laptop");
            }
        }
        case 2->{
            System.out.println("Enter item number");
            int item = in.nextInt();
            switch (item) {
                case 1->System.out.println("chair");
                case 2->System.out.println("Table");
            }
        }
    }
    in.close();
}
}
//end of switch statements
//funfact. strings cant be compared directly using == operator,but rather a unique function called equals() should be used

/*

  String str1 = "hello";
String str2 = new String("hello"); // creates a different object that does not refer to the same object as str1
String str3 = str1; // creates a reference to the same object as str1

System.out.println(str1.equals(str2)); //gives true
System.out.println(str1 == str2); //gives false.
System.out.println(str1.equals(str3)); //gives true.
System.out.println(str1 == str3); //gives true.

because java refernces object variables using the address of the object to save space.
when == is used, it compares the address of the object, not the value.leading to false.
but, when equals() is used, it compares the value of the object,rather than the address.
 */

 //switch statements can be used for strings too.when we add string in condition; it checks with all cases using equals() internally.


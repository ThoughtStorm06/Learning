//greatest letter
import java.util.Scanner;

public class learn30 {

    public static void main(String[] args) {
        // Creating a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the letters array input
        System.out.println("Enter the letters (comma separated):");
        String input = scanner.nextLine();
        // Converting the input string into a character array
        char[] letters = input.replaceAll("\\s+", "").toCharArray();

        // Asking the user for the target character
        System.out.println("Enter the target character:");
        char target = scanner.next().charAt(0);

        // Calling the nextGreatestLetter method and printing the result
        char result = nextGreatestLetter(letters, target);
        System.out.println("The next greatest letter is: " + result);

        // Closing the scanner
        scanner.close();
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;
        target = (char) (target + 1); // Increment target to check the next greatest letter

        while (low <= high) {
            int mid = (low + high) / 2;
            if (letters[mid] > target) 
                high = mid - 1;
            else if (letters[mid] < target)
                low = mid + 1;
            else 
                return letters[mid];
        }

        if (low < letters.length) {
            return letters[low];
        }
        return letters[0];
    }
}


// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int low = 0, high = letters.length - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;
            
//             if (letters[mid] > target) {
//                 high = mid - 1;  // Narrow down the search to the left
//             } else {
//                 low = mid + 1;   // Narrow down the search to the right
//             }
//         }

//         // If `low` is within bounds, it points to the next greatest letter
//         if (low < letters.length) {
//             return letters[low];
//         }

//         // If `low` is out of bounds, return the first letter (wrap-around)
//         return letters[0];
//     }
// }

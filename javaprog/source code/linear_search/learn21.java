//Linear Search
/*
 Linear search iterates through the array one by one. It is the simplest search algorithm
 */
import java.util.Scanner;
public class learn21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        System.out.print("Enter the length of the array:");
        int l=sc.nextInt();
        System.out.println("Values:");
        for(int i=0;i<l;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter an element to be found: ");
        int k=sc.nextInt();
        System.out.println("\n Element is at index: "+ li_index(arr,k));
        System.out.println("Presence of data:"+li_contains(arr, k));
        System.out.println("Number found:"+li_number(arr, k));
        sc.close();
    }

    //index finding
    static int li_index(int[] arr,int n ) {
        for(int i=0;i<arr.length;i++){
            if (arr[i]==n) {
                return i;
            }
        }
         return -1 ;
    }

    static boolean li_contains(int[] arr,int n ) {
        for(int i=0;i<arr.length;i++){
            if (arr[i]==n) {
                return true;
            }
        }
         return false ;
    }

    static int li_number(int[] arr,int n ) {
        for(int i=0;i<arr.length;i++){
            if (arr[i]==n) {
                return n;
            }
        }
         return Integer.MAX_VALUE ;//if number isn't present, it returns highest number that int datatype can hold.
    }
}


//Finding minimum number
import java.util.Scanner;
public class learn24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        System.out.print("Enter the length of the array:");
        int l=sc.nextInt();
        System.out.println("Values:");
        for(int i=0;i<l;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("\n Minimum number in array is: "+ li_index(arr));
        sc.close();
    }

    //index finding
    static int li_index(int[] arr ) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
         return min ;
    }
}
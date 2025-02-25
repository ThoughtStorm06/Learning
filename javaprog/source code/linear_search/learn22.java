//search in range
import java.util.Scanner;
public class learn22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        System.out.print("Enter the length of the array:");
        int l=sc.nextInt();
        System.out.println("Values:");
        for(int i=0;i<l;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter start, and end for the finding the element in a limited rsnge of location ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.print("Enter an element to be found: ");
        int k=sc.nextInt();
        System.out.println("\n Element is at index: "+ li_index(arr,k,start,end));
        sc.close();
    }

    //index finding
    static int li_index(int[] arr,int n,int start,int end) {
        for(int i=start;i<=end;i++){
            if (arr[i]==n) {
                return i;
            }
        }
         return -1 ;
    }
}

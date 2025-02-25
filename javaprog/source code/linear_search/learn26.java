//Finding number of values in an array having even number of digits
import java.util.Scanner;
public class learn26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int l=sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Values:");
        for(int i=0;i<l;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Number of elements in list with even number of digits is: "+ li_even(arr));
        sc.close();
    }

    //index finding
    static int li_even(int[] arr) {
        int count=0;
        int num=0;
        for(int i=0;i<arr.length;i++){
            num=arr[i];
            if(num==0){ //to deal with 0s.
                continue;
            }
            num=Math.abs(num); //to convert negative numbers to positive
            if(((int)Math.log10(num))%2!=0)  //to check even digit logic
            count++;
        }

         return count ;
    }
}

//binary search is used for q that work on sorted array


//ceil of a target- smallest number in array which is greater than or equal to target.
//floor of a target- greatest number in array which is smaller than or equal to target.
import java.util.Scanner;
public class learn29 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("enter number of elements:");
        int i=n.nextInt();
        int[] arr=new int[i];
        System.out.println("enter elements:");
        for(int k=0;k<i;k++)
        arr[k]=n.nextInt();
        System.out.println("Enter Target:");
        int target=n.nextInt();

        System.out.println("Ceil of target is: "+ceil(arr,target));
        System.out.println("Floor of target is: "+floor(arr,target));
        n.close();
    }


    static int ceil(int[] arr,int target) {
        int low=0, high=(arr.length-1);
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]>target){
            high=mid-1;}
            else if(arr[mid]<target)
            low=mid+1;
            else 
            return arr[mid];
        }
        if(low<arr.length){
            return arr[low];
        }
        return Integer.MAX_VALUE;
    }
    static int floor(int[] arr,int target) {
        int low=0, high=(arr.length-1);
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]>target){
            high=mid-1;}
            else if(arr[mid]<target)
            low=mid+1;
            else 
            return arr[mid];
        }
        if((low-1)<arr.length&&low!=0){
            return arr[low-1];
        }
        return Integer.MAX_VALUE;
    }
}


//Note- In binary search, low will always have an index of the data which is higher than target or index is out of bound.
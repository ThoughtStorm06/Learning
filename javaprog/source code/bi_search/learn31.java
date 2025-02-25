//finding number of occurences of a number in a sorted array.


//my code
import java.util.Scanner;
import java.util.Arrays;
public class learn31 {
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
        System.out.println(Arrays.toString(occ(arr,target)));
        n.close();
    }
    static int[] occ(int[] arr,int target) {
        int first=-1,last=-1;
        //first occurence 

        int low=0,high=arr.length-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]<target)
            low=mid+1;
            else {
                high=mid-1;
            }
        }
        if(low<arr.length && arr[low]==target )
        first = low;

        //second occurenece
        low=0;
        high=arr.length-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]<=target)
            low=mid+1;
            else {
                high=mid-1;
            }
        }
        if(high>=0 && arr[high]==target )
        last=high;

        return new int[]{first,last};
    }
}


// Kunal kushwaha's code

// public class FirstAndLastPosition {
//     public static void main(String[] args) {

//     }

//     public int[] searchRange(int[] nums, int target) {

//         int[] ans = {-1, -1};
//         // check for first occurrence if target first
//         ans[0] = search(nums, target, true);
//         if (ans[0] != -1) {
//             ans[1] = search(nums, target, false);
//         }
//         return ans;
//     }

//     // this function just returns the index value of target
//     int search(int[] nums, int target, boolean findStartIndex) {
//         int ans = -1;
//         int start = 0;
//         int end = nums.length - 1;
//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (target < nums[mid]) {
//                 end = mid - 1;
//             } else if (target > nums[mid]) {
//                 start = mid + 1;
//             } else {
//                 // potential ans found
//                 ans = mid;
//                 if (findStartIndex) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }
//         }
//         return ans;
//     }
// }


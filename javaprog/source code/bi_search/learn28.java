public class learn28 {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        int target = 4;
        System.out.println("Target found at: "+biar(arr,target));
    }
    static int biar(int[] arr,int target) {
        int low,high,i;
        boolean direction;//ascending or descending
        if(arr[0]<arr[arr.length-1]){    //ascending
            low=0;
            high=(arr.length-1);
            i=1; //deals with how range of high and low is manipulated
            direction = low<=high;
        }
        else { //descending
            high=0;
            low=(arr.length-1);
            i=-1;
            direction= low>=high;
        }
        
        while(direction) {
            int mid = low+(high-low)/2;
            if(arr[mid]>target) 
            high=mid-i;
            else if(arr[mid]<target)
            low=mid+i;
            else 
            return mid;
        }
        return -1;
    }
}

// conventional code ......


// public class Learn28 {
//     public static void main(String[] args) {
//         int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//         int target = 4;
//         System.out.println("Target found at: " + binarySearch(arr, target));
//     }

//     static int binarySearch(int[] arr, int target) {
//         if (arr.length == 0) return -1; // Handle empty array

//         boolean isAscending = arr[0] < arr[arr.length - 1];
//         int low = 0, high = arr.length - 1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             }

//             if (isAscending) {
//                 if (arr[mid] < target) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             } else {
//                 if (arr[mid] < target) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }

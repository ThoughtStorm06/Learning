public class learn33 {
    


}


 class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1,index;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1])
            start=mid+1;
            if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1])
            end=mid-1;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
                index=mid;
                break;
            }
        }
        return index;
        
    }
}
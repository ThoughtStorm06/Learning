public class learn32 {
    //to search position of element in sorted infinite array.
    public int search(int[]arr,int target) {
        //since ,array is infinite  ; we dont have finite length, thus position of targget should be found by checking the value by take chunks in array.
        int start=0, end=100;
        while(!(arr[start]<=target) && !(arr[end]>=target)) {
            start= end+1;
            end=end*2+1;
        }

        //checking position after finding chunk.
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]<target)
            start=mid+1;
            else if(arr[mid]>target)
            end=mid-1;
            else {
                return mid;
            }
        }
        return -1;
    }
}


//Linear Search in 2d array
import java.util.Scanner;
import java.util.Arrays;
public class learn23 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int[][] arr= {
            {2,3,4},
            {5,6,7,8},
            {1},
            {10,11,14,15,16}
        };
        System.out.print("Enter number to be found :");
        int num=i.nextInt();
        System.out.println("Number is at location :"+Arrays.toString(Li2d(arr,num)));
        i.close();
    }

    static int[] Li2d(int[][]arr,int num) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                if(num==arr[i][j])
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
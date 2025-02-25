//multi-dimensional arrays 

import java.util.*;

public class learn18 {
    
    static void learn18_1() {
        //syntax for multi-dimensional arrays
        //1.for declare and initialize
        //dataType[][] arrayName = new dataType[row][column]; 
        //or, dataType[][] arrayName = {{row1-column1, row1-column2}, {row2-column1, row2-column2}}; 

        //2.for separate declaration and initialization
        //dataType[][] arrayName;
        //arrayName = new dataType[row][column]; or, or, arrayName = new dataType[][]{{row1-column1, row1-column2}, {row2-column1, row2-column2}};

        //3.for declare and initialize with specific size
        //dataType[][] arrayName = new dataType[row][column];
        //arrayName[0][0] = value1;
        //arrayName[0][1] = value2;
        //goes on....
    }




    static void learn18_2() {
        //input of array.
        //1. direct
        int[][] arr= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(arr[0][0]);

        int[][] arr2= {// each row can have different number of columns(subarrays have different number of elements)
            {1,2,3,4},
            {4,},
            {7,8,9}
        };
        System.out.println(arr2[0][0]);


        //2. using for loop
        Scanner in = new Scanner(System.in);
        int[][] arr3 = new int[3][3];
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                arr3[i][j]=in.nextInt();
            }
        }
        in.close();
    }

    static void learn18_3() {
        //output of array
        //1. using for loop
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //2. using for each loop
        for(int[] a:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }

        //3. using Arrays.deepToString() method
        System.out.println(Arrays.deepToString(arr));

        //4. using Arrays.toString() method
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }



    public static void main(String[] args) {
        learn18_1();
        learn18_2();
        learn18_3();
    }
}
        
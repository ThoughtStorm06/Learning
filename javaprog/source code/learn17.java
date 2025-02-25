import java.util.Scanner;
import java.util.Arrays;
public class learn17 {



    static void learn17_1(){
        String[] arr=new String[5];
        //when a string, a reference variable, is declared with specific size;variable points to the memory location of the array object in the heap. each array index have a default value of null(no values stored).
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }



    static void learn17_2(){
        //input of arrays from user
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        //output of arrays
        //1.using for loop
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i==(arr.length-1)) {break;}
            System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.print("[");
        //2.using for each loop(enchanced for loop)
        for(int num:arr){
            System.out.print(num);
            if(num==arr[arr.length-1]) {break;}
            System.out.print(", ");
        }
        System.out.println("]");
        //3.using Arrays.toString() method
        System.out.println(Arrays.toString(arr));

    }
    static void learn17_3() {
        Scanner sc = new Scanner(System.in);
        //input and output of objects of array(string).
        String[] arr = new String[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        //output of arrays
        //1.using for loop
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i==(arr.length-1)) {break;}
            System.out.print(", ");

        }
        System.out.println("]");
        //2.using for each loop(enchanced for loop)
        System.out.print("[");
        for(String str:arr){
            System.out.print(str);
            if (str==arr[arr.length-1]) {break;}
            System.out.print(", ");
        }
        System.out.println("]");


        //3.using Arrays.toString() method
        System.out.println(Arrays.toString(arr));

    }



    public static void main(String[] args) {
        learn17_1();
        learn17_2();
        learn17_3();
    }
}

//array of an object like string, store the reference of the object in the array.
//the refernce of object in that array points towards the object in the heap memory itself.
//array of an object has a variable in stack which point towards the reference of the object in the heap.
//each reference of the object in the heap points towards the object in the same heap.
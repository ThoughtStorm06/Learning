import java.util.Arrays;//Arrays
//types in which we can store array values.
public class learn16 {
    public static void main(String[] args) {
    //1. initialize at declaration
    int[] arr1 = {1,2,3,4,5};//or int[] arr = new int[]{1, 2, 3, 4};

    //2. Separate Declaration and Initialization
    int[] arr2; 
    arr2 = new int[]{1,2,3,4,5};
    //3.Declaring an Array with a Fixed Size If you want a fixed size and assign values later:
    int[] arr3 = new int[5];
    arr3[0]=1;
    arr3[1]=2;
    arr3[2]=3;; //asssiging values at each index
    System.out.println(Arrays.toString(arr1));          
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(arr3));  //when arrays aredeclared with specified size, each index is initialized with a default value of 0.        
          

    /*
    1. Arrays cant be assigned values after declaration with specific size, using curly brackets.
    2. Array identifier is a reference variable and can be used to access the elements of the array.
    3. identifier is stored in stack while objects of the array are stored in heap.
    4. Array elements are stored during runtime(dynamic memory allocation)
    5. 1-D array are stored in contiguous memory locations.
    6. while, multi-dimensional arrays are stored in non-contiguous memory locations. This is because,Each sub-array is a separate object in the heap, potentially being stored in non-contiguous memory locations by JVM.
    7.Every element of an array is of the same data type, and they are accessed using an index.
     */

}
}
//new keywword is used to create an object in the heap memory.
//null literal is used to only for initializing an object reference variable. it is used to indicate that the variable is not pointing to any object.
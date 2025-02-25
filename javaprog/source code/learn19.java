//Arraylist introduction
import java.util.ArrayList;
public class learn19 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1); //to add values
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println(list);
        list.remove(3);//to remove values from arraylist at index 3
        System.out.println(list);



        list.set(0, 10);//to set(update) value at index 0 to 10
        System.out.println(list);


        list.add(2, 20);//to add value 20 at index 2
        System.out.println(list);// the element at 2 index will be shifted to 3 index


        list.contains(20);//to check if the value is present in the arraylist
        System.out.println(list.contains(20));


        System.out.println(list.get(2));//to get the value at index 2


        System.out.println(list.indexOf(20));//index of the value 20 in the arraylist


        System.out.println(list.indexOf(40));//if value is not present in the arraylist it will return -1


        System.out.println(list.size());//to get the size of the arraylist


        list.clear();//to clear the arraylist
        System.out.println(list);


    }
}

/*
 Arraylist is a class that is used to create a list of objects. It is a collection of objects that are stored in a contiguous block of memory.
  It is a dynamic array that can grow and shrink as needed. It is a good choice for storing a large number of objects,
  without the need to create a new array every time the list grows.

 It is a good choice for storing a large number of objects, without the need to create a new array every time the list grows
 I
 */
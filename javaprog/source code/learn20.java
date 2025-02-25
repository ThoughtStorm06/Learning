//multi-dimensional arraylist
import java.util.ArrayList;
import java.util.Scanner;

public class learn20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);

        System.out.println(list.get(0).get(0)); //to get the value at index 0,0

        list.get(0).remove(2); //to remove the value at index 0,2
        System.out.println(list); 

        list.get(0).add(1,10);
        System.out.println(list);//to add the value 10 at index 0,1

        list.get(0).set(0, 100);
        System.out.println(list);//to set the value 100 at index 0,0

        list.get(0).contains(100);
        System.out.println(list.get(0).contains(100));//to check if the value 100 is present in the arraylist

        System.out.println(list.get(0).indexOf(100));//to get the index of the value 100

        System.out.println(list.get(0).indexOf(200));//to get the index of the value 100

        System.out.println(list.get(0).size());//to get the size of the arraylist

        System.out.println(list.size());

        list.get(0).clear();
        System.out.println(list);//to clear the arraylist

        list.clear();
        System.out.println(list);//to clear the arraylist

        sc.close();
       }
}
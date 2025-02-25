//Method overloading
public class learn12 {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum("Hello","World"));
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    static String sum (String a,String b) {
        return a+b;
    }
} 
//methods can be overloaded by changing the number of parameters or the type of parameters.
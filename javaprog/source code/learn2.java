public class learn2 {
    public static void main(String args[]) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        System.out.println(args[0]+args[1]);


        //extra code to work with string for calculations
        int a=0,b=0;
        for(String i:args) {
            if(i==args[0]){
            for(char j:i.toCharArray()) {
                a=a*10 + j-'0';
            }
        }
        else{
            for(char j:i.toCharArray()) {
                b=b*10 + j-'0';
            }

        } 
    }
        System.out.println(a+b);
    
}
}
/*
-->String args[] is the array of string which is passed as a command line argument to the main
-->args is a variable and can be replaced with any other variable(identifier)
-->and strings being a data type, can be replaced with any other data type.

OUTPUT:
PS C:\CODING_programs\javaprog> javac learn2.java
PS C:\CODING_programs\javaprog> java learn2 hi hello
hi
hello


 */
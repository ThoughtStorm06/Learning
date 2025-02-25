//Richest Customer Wealth
public class learn25 {

    public static void main(String[] args) {
        System.out.println(
            "Richest man wealth is:"+maximumWealth(new int[][]{
                {1,2,3},
                {2,3,4},
                {5,4,2}
            })
        );
    }
    
        static int maximumWealth(int[][] accounts) {
            int rich=0;
            for(int[] m:accounts ){
                int i=0;
                for(int n=0;n<m.length;n++) {
                    i+=m[n];
                    if(rich<i && n==(m.length-1)) {
                    rich=i;}
                }
            }
            return rich;
        }
    }
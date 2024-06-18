package CodeForces;
import java.util.* ;
public class turtle_PiggyGame {
    private static int turtleGame(int l, int r){
        int count=0 ;
        double max= 0 ;
        double i=1 ;
        while(max<= r){
            max=Math.pow(2,i);
            if(max<=r){
                count++ ;
            }
            i++ ;
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int l=sc.nextInt() ;
        int r=sc.nextInt() ;
        System.out.println(turtleGame(l,r));


    }
}

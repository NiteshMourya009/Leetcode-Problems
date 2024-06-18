package Data_Structure_And_Algorithm.Backtracking;
// we can move only in direction right and down only
public class rate_in_Maze {
    public static void main(String[] args) {

        int rows= 2 ;
        int cols=3 ;
        int count= maze(1,1,rows,cols);
        System.out.println(count) ;

    }
//    sr= start row
//    sc= smaitart cols;
//    er= end row ;
//    ec= end cols ;
    private static int maze(int sr, int sc, int er, int ec) {
        if(sr>er || sc>ec ){
            return 0 ;
        }
        if(sr==er && sc==ec) return 1 ;
        int downWays= maze(sr+1,sc,er,ec) ;
        int rightWays= maze(sr,sc+1, er,ec) ;
        int totalWays= downWays + rightWays ;
        return totalWays ;
    }
}

package PatternProgram;
public class p10 {
    public static void main(String[] args) {
        f1();
    }
     
    public static void f1(){
        for(int row=1; row<=5; row++){
            for(int col=1; col<=5; col++){
                if(col<row){
                    System.out.print("  ");
                }
                else{
                    System.out.print(col+" ");
                }
            }
            System.out.println();
        }
    }
}

/*
 * 1 2 3 4 5
 *   2 3 4 5
 *     3 4 5
 *       4 5
 *         5
 */

package PatternProgram;

public class p14 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        int cunt=3;
        for(int row=1; row<=4; row++){
            for(int col=1; col<=4-row+4; col++){
                if(cunt>=col){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            cunt--;
            System.out.println();
        }
    }
}


/*
 *         * * * *
 *       * * * *
 *     * * * *
 *   * * * *
 * 
 */

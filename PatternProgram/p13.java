package PatternProgram;

public class p13 {

    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        int count=4;
        for(int row=1; row<=4; row++){
            for(int col=1; col<=4+(row-1); col++){
                if(row>col){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}

/*
 *  * * * *
 *   * * * *
 *    * * * *
 *     * * * *
 */
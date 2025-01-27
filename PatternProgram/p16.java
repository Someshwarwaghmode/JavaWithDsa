package PatternProgram;

public class p16 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        int count1=4;
        int count2=4;
        for(int row=1; row<=4; row++){
            for(int col=1; col<=7; col++){
                if(count1>col){
                    System.out.print("   ");
                }
                else if(col>count2){
                    System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            count1--;
            count2++;
            System.out.println();
        }
    }
}

/*
 *         *
 *       * * *
 *     * * * * *
 *   * * * * * * *
 * 
 */
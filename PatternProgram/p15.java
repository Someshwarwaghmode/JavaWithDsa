package PatternProgram;

public class p15 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        for(int row=1; row<=5; row++){
            for(int col=1; col<=5; col++){
                if(col<=row){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}



/*
 * 
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 * 
 */
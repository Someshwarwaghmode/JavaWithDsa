package PatternProgram;

public class p6 {
    public static void main(String[] args) {
        f1();
    }
    public static void f1(){
        for(int row=1; row<=6; row++){
            for(int col=1; col<=row; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

/*
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 *  * * * * * *
 */

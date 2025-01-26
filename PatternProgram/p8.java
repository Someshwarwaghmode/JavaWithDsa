package PatternProgram;

public class p8 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        for(int row=97; row<=101; row++){
            for(int col=97; col<=row; col++){
                char value=(char)col;
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
/*
 * a
 * a b
 * a b c
 * a b c d
 * a b c d e
 */
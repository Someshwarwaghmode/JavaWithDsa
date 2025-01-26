package PatternProgram;

public class p5 {
    public static void main(String[] args) {
       f1(); 
    }

    public static void f1(){
        for(int row=1; row<=5; row++){
            for(int col=97; col<=101; col++){
                char value=(char)col;
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}


/*
 * a b c d e
 * a b c d e
 * a b c d e
 * a b c d e
 * a b c d e
 * 
 */
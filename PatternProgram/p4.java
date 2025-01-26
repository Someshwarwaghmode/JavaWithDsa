package PatternProgram;

public class p4 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        for(int row=97; row<=101; row++){
            for(int col=1; col<=5; col++){
                char value = (char) row;
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
/*
 *  a a a a a 
    b b b b b 
    c c c c c 
    d d d d d 
    e e e e e 
 */
package PatternProgram;

public class p9 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        for(int row=1; row<=5; row++){
            for(int col=101; col>=97; col--){
                char value=(char)col;
                System.out.print(value+" ");
            }
            System.out.println();

        }
    }
}
/*
 * e d c b a
 * e d c b a
 * e d c b a
 * e d c b a
 * e d c b a
 */
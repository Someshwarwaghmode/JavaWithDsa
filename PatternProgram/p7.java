package PatternProgram;

public class p7 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        for(int row=1; row<=5; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */
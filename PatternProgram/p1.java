package PatternProgram;
public class p1 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        for(int row=1; row<=5; row++){
            for(int col=1; col<=5; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

/*output:
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
 */
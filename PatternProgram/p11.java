package PatternProgram;

public class p11 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        int number=10;
        for(int row=1; row<=10; row++){
            for(int col=1; col<=10 ;col++){
                if(col==number){
                    System.out.print(col);
                    number--;
                    break;
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

/*
 * 
 * 0 0 0 0 0 0 0 0 0 10
 * 0 0 0 0 0 0 0 0 9
 * 0 0 0 0 0 0 0 8
 * 0 0 0 0 0 0 7
 * 0 0 0 0 0 6
 * 0 0 0 0 5
 * 0 0 0 4
 * 0 0 3
 * 0 2
 * 1
 */

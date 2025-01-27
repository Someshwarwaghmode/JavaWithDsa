package PatternProgram;

public class p12 {
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        for(int row=1; row<=4; row++){
            for(int col=1; col<=4; col++){
               if(row==2 || row==3){
                    if(col==2 || col==3){
                        System.out.print("   ");
                    }
                    else{
                        System.out.print(" * ");
                    }
               }
               else{
                System.out.print(" * ");
               }
               
            } 
            System.out.println();
        }  
    }
        
}

/*
 *  * * * *
 *  *     *
 *  *     *
 *  * * * *
 */
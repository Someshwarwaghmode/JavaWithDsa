import java.util.*;

public class ReplaceOldElementByNewEle {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Old Element::");
        int oldNo=input.nextInt();
        System.out.println("Enter New Element::");
        int newNo=input.nextInt();
        int[] x = RepEle(arr, newNo, oldNo);
        System.out.println(Arrays.toString(x));
    }
    //replace old element by ew Element
    public static int[] RepEle(int[] arr, int newNO, int oldNo){
        for(int i=0; i<arr.length-1; i++){
            if(oldNo==arr[i]){
                arr[i]=newNO;
            }
        }
        System.out.print("Sorry"+oldNo+"  Element Not Present in Array....\n\n");
        return arr;
    }
}

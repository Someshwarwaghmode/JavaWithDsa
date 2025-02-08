import java.util.Arrays;
import java.util.Scanner;

public class updateAtlast {
    public static void main(String[] args) {
        int[] arr = {1,2,35,68,56,2};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Updated No::");
        int newNo = input.nextInt();
        int[] x = updateLast(arr, newNo);
        System.out.println(Arrays.toString(x));
    }

    public static int[] updateLast(int[] arr, int newNo){
        for(int i=arr.length-1; i>0; i--){
            if(i==arr.length-1){
                arr[i]=newNo;
            }
        }
        return arr;
    }
}

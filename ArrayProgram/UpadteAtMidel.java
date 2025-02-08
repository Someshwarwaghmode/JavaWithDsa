import java.util.Arrays;
import java.util.Scanner;

public class UpadteAtMidel {
    public static void main(String[] args) {
        int[] arr ={4,56,8,4,5,6,2};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Updated Element::");
        int newNo = input.nextInt();
        int[] x = UpdateMidel(arr,newNo);
        System.out.println(Arrays.toString(x));
    }
    //update at the midel element ..........
    public static int[] UpdateMidel(int[] arr, int newNo){
        int index = (arr.length-1)/2;
        for(int i=0; i<arr.length-1; i++){
            if(i==index){
                arr[i]=newNo;
            }
        }
        return arr;
    }
}

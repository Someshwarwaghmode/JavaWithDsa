import java.util.Arrays;
import java.util.Scanner;

public class UpdateEleAtFirst {
    public static void main(String[] args) {
        int[] arr={1,45,78,6,5,4};
        Scanner input=new Scanner(System.in);
        int newNo = input.nextInt();
        int x[] = InsertAtFirst(arr , newNo);
        System.out.println(Arrays.toString(x));
    }

    public static int[] InsertAtFirst(int[] arr, int newNo){
        for(int i=0; i<arr.length-1; i++){
            if(i==0){
                arr[i]=newNo;
            }
        }
        return arr;
    }
}

package LargestElementInArray;
import java.util.Arrays;
public class Brute_Force_Approach_LargesteElement {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,0};
        Arrays.sort(arr);
        int x=Brute_Force_Approach_LargesteEle(arr);
        System.out.println(x);
    }

    public static int Brute_Force_Approach_LargesteEle(int arr[]){
        int max=arr[arr.length-1];
        return max;
    }
}
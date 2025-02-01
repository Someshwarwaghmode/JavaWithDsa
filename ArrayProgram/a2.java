import java.util.*;
public class a2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int x = f1(arr);
        System.out.println("Sum Of Array::"+x);
    }
    
//Program to calcualte sum of elements present in an array.
    public static int f1(int arr[]){
        int sum = 0;
        for(int i=0; i<5; i++){
            sum += arr[i];
        }
        return sum;
    }
}

package sortArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of Array::");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        
        int[] NewArray = ArraySort1(arr,size);
        System.out.println(Arrays.toString(NewArray));

        int[] newLoopArray = arrayInOneLoop(arr,size);
        System.out.println(Arrays.toString(newLoopArray));

    }

    public static int[] ArraySort1(int[] arr, int size){
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr; 
    }

    public static int[] arrayInOneLoop(int[] arr, int size){
        int i=0;
        while (i<size) {
            if(arr[i]>arr[size-1]){   // 4  5         11  6
                int temp = arr[i];
                arr[i] = arr[size-1];
                arr[size-1] = temp;
            }
            else if(arr[i]==arr[size-1]){
                arr[i] = arr[size-1];
            }
            i++;
            size--;
        }
        return arr;
    }
    

}

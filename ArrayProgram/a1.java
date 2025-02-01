import java.util.*;
public class a1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of array::");
        int size = input.nextInt();
        int arr[]= new int[size];
        f1(arr,size);
    }

    //Program to read and write array elements.
    public static void f1(int arr[] , int size){
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr Element of Array::");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Array Element::");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

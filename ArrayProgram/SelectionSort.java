import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        int x[]=SelecSort(arr);
        System.out.println(Arrays.toString(x));
    }

    public static int[] SelecSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}

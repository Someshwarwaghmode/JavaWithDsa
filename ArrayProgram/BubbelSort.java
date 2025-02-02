import java.util.Arrays;

public class BubbelSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        int x[]=BubbleSort(arr);
        System.out.println(Arrays.toString(x));
    }

    public static int[] BubbleSort(int arr[]){
        //3,46,24,52,20,9
        for(int k=0; k<arr.length; k++){
            int i=0;
            int j=0;
            while(i<arr.length-1){
                if(arr[i]<arr[j+1]){
                    i++;
                    j++;
                }
                else{
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                    i++;
                    j++;
                }
            }
        }
        return arr;
    }
}

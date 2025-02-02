package LargestElementInArray;

public class UsingRecursion {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,0};
        int x=LargeEle(arr,0,arr[0]);
        System.err.println(x);  
    }
    public static int LargeEle(int arr[],int n,int max){
        int size=arr.length-1;
        if(n<size){
            n++;
            if(arr[n]>max){
                max=arr[n];
                LargeEle(arr, n, max);
            }
            else{
                LargeEle(arr, n, max);
            }
        }
        return max;
    }
}
//2,5,1,3,0
//
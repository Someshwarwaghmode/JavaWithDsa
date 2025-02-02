package LargestElementInArray;
public class LargesteElement {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,0};
        int Result = largeElement(arr);
        System.out.println(Result);
    }

    public static int largeElement(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}

//2,5,1,3,0
//large ele-->5 

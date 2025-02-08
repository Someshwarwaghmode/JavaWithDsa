import java.util.ArrayList;

public class intersectionofarray {
    public static void main(String[] args) {
        int arr[]={1,2,34,5,6,7,90};
        int arr1[]={4,7,6,8,8,7,4,};
        int x[]=interSection(arr,arr1);
    }

    public static ArrayList<Integer>    interSection(int[] arr,int[] arr1){
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr1.length-1; j++){
                if(arr[i]==arr1[j]){
                    result.add(arr[i]);
                }
            }
        }
        return result;
    }
}

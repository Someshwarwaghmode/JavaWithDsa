public class a4 {
    public static void main(String[] args) {
        int arr[] = {1,45,78,26,44};
        int x = f1(arr);
        System.out.println(x);
    }

    //Program to calcualte sum of odd elements present in an array.
    public static int f1(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
// output
// 46
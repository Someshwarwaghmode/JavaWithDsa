public class a7 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,12,6};
        int x = f1(arr);
        System.out.println(x);
    }

    //Program to calcualte sum of elements which are divisible by 2 and 3-present-in-an-array.
    public static int f1(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0 && arr[i]%3==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}

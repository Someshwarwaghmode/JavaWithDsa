public class a3 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int x = f1(arr);
        System.out.println("Even Element Sum is::"+x);
    }

    //Program to calcualte sum of even elements present in an array.
    public static int f1(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}

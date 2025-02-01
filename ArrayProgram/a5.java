public class a5 {
    public static void main(String[] args) {
        int arr[]={1,-2,3,-8,4,6,-9};
        int x = f1(arr);
        System.out.println("Sum of +ve Element present in array :: "+x);
    }
    //Program to calcualte sum of +ve elements present in an array
    public static int f1(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
// output
// Sum of +ve Element present in array ::14
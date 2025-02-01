public class a6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,-8,-8,5,-6,-8,-10};
        int x = f1(arr);
        System.out.println(x);
    }

    //Program to calcualte sum of-ve elements present in an array.
    public static int f1(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}

// output
//(-8)+(-8)+(-6)(-8)+(-10)
// -40
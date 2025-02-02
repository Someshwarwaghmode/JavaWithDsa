public class a7 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int x = f1(arr);
        System.out.println(x);
    }

    //Program to calcualte sum of elements which are divisible by 2 and 3-present-in-an-array.
    public static int f1(int arr[]){
        int sum=2;
        for(int i=0; i<arr.length; i++){
            for(int j=2; j<=arr[i]; j++){
                if(arr[i]%j!=0){
                    sum+=arr[i];
                    break;
                }
                else{
                    break;
                }
            }
        }
        return sum;
    }
}
// output
// 18
//1 2 3 4 5 6 7
// 2+3+5+7=17
//
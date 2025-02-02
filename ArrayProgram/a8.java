//Program to calcualte sum of all elements factorials present in an array
public class a8 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int x=f1(arr);
        System.out.println(x);
    }

    public static int f1(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            int n=arr[i];
            int res=1;
            for(int j=2; j<=n; j++){
                res=res*j;
            }
            sum+=res;
        }
        return sum;
    }
}


//1=1
//2=2*1=2
//4-->1*2->2, 2*3->6, 6*4->24;
//5-->1*2->2,2*3->6,6*4->24,24*5->120
//sum=1+2+24+120--->147

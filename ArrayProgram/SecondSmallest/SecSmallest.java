package SecondSmallest;

public class SecSmallest {
    public static void main(String[] args) {
        int arr[]={1,2,7,7,5};
        int x = retrunSecSmall(arr);
        System.out.println(x);
    }

    public static int retrunSecSmall(int arr[]){
        int s=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<s){
                int temp=s;
                s=arr[i];
                ss=temp;
            }
            else if(arr[i]<ss){
                ss=arr[i];
            }
        }
        return ss;
    }
        
}


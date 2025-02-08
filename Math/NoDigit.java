public class NoDigit {
    public static void main(String[] arr) {
        int x = FindNoDigit();
        System.out.println(x);
    }

    public static int FindNoDigit() {
        int count = 0;
        int i = 0;
        int num = 0909;
        
        while(num!=0){
            System.out.println(num);
            num = num / 10;
            count++;
        }
        return count;
    }
}
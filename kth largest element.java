import java.util.Arrays;
class Main {
    public static void main(String[] args){
       int [] arr={10,33,30,60,50};
       int k=2;
        
       int n = arr.length;
        Arrays.sort(arr);
        if (k <= n) {
            int kthLargest = arr[n - k];
            System.out.println(k + "th largest element: " + kthLargest);
        }
    }
}

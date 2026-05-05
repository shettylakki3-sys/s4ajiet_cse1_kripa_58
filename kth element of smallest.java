import java.util.Arrays;
class Main {
    public static void main(String[] args){
       int [] arr={10,33,30,60,50};
       int k=2;
        
       int n = arr.length;
        Arrays.sort(arr);
        if (k <= n) {
            int kthSmallest = arr[k-1];
            System.out.println(k + "th smallest element: " + kthSmallest);
        }
    }
}

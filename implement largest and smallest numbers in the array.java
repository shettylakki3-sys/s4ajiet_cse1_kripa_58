class Main {
    public static void main(String[] args){
       int [] arr={10,20,30,40,50};
       int smallest=arr[0];
       int largest=arr[0];
       int n=arr.length;
       System.out.println("lenth of the array");
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
           if(arr[i] < smallest)
           {
               smallest=arr[i];
           }
           if(arr[i] > largest)
           {
               largest=arr[i];
           }
       }
       System.out.println("Smallest:"+smallest);
       System.out.println("largest:"+largest);
    }
}

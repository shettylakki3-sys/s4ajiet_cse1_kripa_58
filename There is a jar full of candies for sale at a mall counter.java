class Main {
    public static void main(String[] args){
        int N = 10; 
        int K = 5; 
        int demand=3;
        int total = N;
        
         if (demand > total) {
            System.out.println("INVALID INPUT");
        } else {
            total = total -demand;
            System.out.println("Number of Candies Sold: " +demand);
            
             if (total <= K) {
                total = N; // refill
            }

            System.out.println("Number of Candies available: " + total);
        }
           
    }
}

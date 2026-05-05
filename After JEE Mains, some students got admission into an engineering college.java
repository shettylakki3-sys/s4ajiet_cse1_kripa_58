import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int minRank = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int rank = sc.nextInt();

            if (rank < minRank) {
                if (minRank != Integer.MAX_VALUE) {
                    count++; 
                }
                minRank = rank;
            }
        }

        System.out.println(count);
    }
}

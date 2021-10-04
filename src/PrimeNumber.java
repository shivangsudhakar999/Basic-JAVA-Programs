import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        int d=2;
        int i=0;
        if(n>1) {
            while (d <= n - 1) {
                if (n % d == 0) {
                    System.out.println("Not prime");
                    return;

                }
                d = d + 1;

            }
            System.out.println("Prime");
        }
            else
            System.out.println("Not Prime");
    }
}

import java.util.Scanner;

public class CountingDigitsofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter the Number ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
            System.out.println(count);
        }
    }
}

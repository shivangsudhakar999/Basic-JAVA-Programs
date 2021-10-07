import java.util.Scanner;

public class DisplayDigitsOfNumber {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ");
    int n=sc.nextInt();
    while (n>0)
    {
        int r=n%10;
         n=n/10;
        System.out.println(r);
    }

    }
}

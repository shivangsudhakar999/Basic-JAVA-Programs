import java.util.Scanner;

public class Factorial_of_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int factorial=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);



    }
}

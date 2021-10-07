import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CHECK WHETHER IT IS AN ARMSTRONG NUMBER OR NOT");
        int  sum=0;
        int n=sc.nextInt();
        int m = n;
        while(n!=0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;

        }
        System.out.println(sum);

        if (m==sum) {
            System.out.println("its an ARMSTRONG NUMBER");
        }
            else{
                System.out.println("its not an ARMSTRONG NUMBER");
            }
        }
    }


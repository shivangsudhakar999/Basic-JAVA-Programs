import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CHECK WHETHER IT IS AN ARMSTRONG NUMBER OR NOT");
        int  sum=0;
        int n=sc.nextInt();
        int m = n;
        int te=n;

        int counter=0;
        int temp;
        for(;m!=0;)
        {
            temp=m%10;
            counter++;
            m/=10;
        }
        while(n!=0){
            int r=n%10;
            sum=(int)(sum+(Math.pow(r,counter)));
            n=n/10;

        }
        System.out.println(sum);

        if (te==sum) {
            System.out.println("its an ARMSTRONG NUMBER");
        }
            else{
                System.out.println("its not an ARMSTRONG NUMBER");
            }
        }
    }


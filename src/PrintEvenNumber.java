import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();

        int i=0;
        int sum=0;
        while(i<=n){
           //System.out.println(sum);
            sum=sum+i;
            i=i+2;


        }
        System.out.println(sum);
    }
}

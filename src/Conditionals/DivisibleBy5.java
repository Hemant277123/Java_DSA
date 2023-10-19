import java.util.Scanner;
public class DivisibleBy5 {

    public static void main(String[] args) {
        System.out.println("Enter the +ve Integer ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n%10;
        if (r == 5||r==0) {
            System.out.println("Divisible by five "+n);

        }
        else{
            System.out.println("Not Divisible by five "+n);

        }

    }
}
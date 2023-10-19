import java.util.Scanner;
public class EvenOdd {

    public static void main(String[] args) {
        System.out.println("Enter the +ve Integer ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if (n%2==0) {
            System.out.println("Even Integer : "+n);

        }
        else{
            System.out.println("Odd Integer : "+n);
        }
    }
}
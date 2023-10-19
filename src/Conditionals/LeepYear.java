import java.util.Scanner;
public class LeepYear {

    public static void main(String[] args) {
        System.out.println("Please Enter any Year ");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();

        if((y%400==0)||(y%4 == 0 && y%100!=0)) {
            System.out.println("Leep Year: "+y);

        }

        else
        {
            System.out.println("Not a Leep Year : "+y);
        }
    }
}
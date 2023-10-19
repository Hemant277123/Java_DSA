package Conditionals;

import java.util.Scanner;

public class TaxCalclation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float sal=sc.nextInt();
        float tax=sal/100;
        if(sal<=10000){
            System.out.println("No Tax "+sal);
        }
        else if(sal>10000 &&sal<=20000){
            System.out.println("10% Tax");
            System.out.println(sal);
            System.out.println("tax : "+ tax*10);
            System.out.println("Net Income : "+(sal-tax));
        }
        else if(sal>20000 &&sal<=30000){
            System.out.println("15% Tax");
            System.out.println(sal);
            System.out.println("tax : "+tax*15);
            System.out.println("Net Income : "+(sal-tax));
        }
        else{
            System.out.println("25% Tax");
            System.out.println(sal);
            System.out.println("tax : "+tax*25);
            System.out.println("Net Income : "+(sal-tax));
        }
        System.out.println();
        System.out.println("Thank you,Have a nice Day!");
    }
}

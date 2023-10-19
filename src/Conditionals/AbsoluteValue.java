package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Please Enter any Integer");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            n=-n;
        }
        System.out.println("Absolute Value is:"+n);
    }
}

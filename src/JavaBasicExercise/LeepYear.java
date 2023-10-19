package JavaBasicExercise;

import java.util.Scanner;

public class LeepYear {
    static void leepYear(){
        System.out.println("Please enter the year");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if((y%400==0)||(y%4 == 0 && y%100!=0)){
            System.out.println("Leep year " +y);
        }
        else{
            System.out.println("Not a Leep Year "+y);
        }
    }
    public static void main(String[] args) {
        leepYear();
    }
}

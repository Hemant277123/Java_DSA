package JavaBasicExercise;

import java.util.Scanner;

public class SimpleInterest {
    static void Interest(float p,float r,float t){

        float si=(p*r*t)/100;
        System.out.println("SI IS : "+si);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p= sc.nextFloat();
        float r= sc.nextFloat();
        float t= sc.nextFloat();
        System.out.println("Simple interest is:");
        Interest(p,r,t);
    }
}

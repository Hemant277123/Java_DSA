package JavaBasicExercise;

import java.util.Scanner;

public class AreaOfRectangle {
    static void multiply(float l,float b){

        float area=l*b;
        float peri=2*(l+b);
        System.out.println(area);
        System.out.println(peri);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float l= sc.nextFloat();
        float b= sc.nextFloat();

        System.out.println("Area of Rectangle and perimetere is:");
        multiply(l,b);


    }
}

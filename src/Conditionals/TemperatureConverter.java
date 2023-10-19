package Conditionals;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float c=sc.nextFloat();
        float f=(c*9/5)+32;
        System.out.println("Temperature in Farenhite is :"+f);
        System.out.println("Temperature in Celcius is :"+c);

    }
}

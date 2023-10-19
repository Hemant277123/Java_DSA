package JavaBasicExercise;

import java.util.Scanner;

public class CelciusAndForenhite {
    static void forenhite(){
        System.out.println("Please enter the temperature in celcius");
        Scanner sc=new Scanner(System.in);
        float c=sc.nextFloat();
        float temp_in_forenhite=(c*5/9)+32;
        System.out.println(temp_in_forenhite);
    }
    static void celcius(){
        System.out.println("Please enter the temperature in celcius");
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        float temp_in_celcius=5/9*(f-32);
        System.out.println(temp_in_celcius);

    }
    public static void main(String[] args) {
        System.out.println("Temperature in Forenhite is ");
        forenhite();
        System.out.println("Temperature in Celcius is ");
        celcius();

    }
}

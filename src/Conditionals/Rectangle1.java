package Conditionals;

import java.util.Scanner;

/*Give the length and bredth of a rectangle WAP
in java to find whether the area of the
rectangle is greater than its perimeter
 */
public class Rectangle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l=sc.nextInt();
        double b=sc.nextInt();
        double area=(l*b);
        double pere=2*(l+b);

        System.out.println("Length is:"+l+"Bredth is:"+b);
        System.out.println("Area is= "+area);
        System.out.println("Perimeter is= "+pere);
        if(area<pere){
            System.out.println("Perimeter is greater than Area");

        }
        else {
            System.out.println("Area is greater than Perimeter");
        }
    }
}

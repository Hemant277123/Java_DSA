package Conditionals;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter any Alphabet Charecter");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);

        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowel : "+c);
        }
        else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("Vowel : "+c);
        }
        else {
            System.out.println("Consonant : "+c);
        }

    }
}

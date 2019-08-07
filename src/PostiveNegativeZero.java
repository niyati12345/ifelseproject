import java.util.Scanner;

public class PostiveNegativeZero {

    public static void main(String args[]){
        Scanner number=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=number.nextInt();

        if(a>0){
            System.out.println("Number is Positive");
        }
        else if(a<0){ System.out.println("Number is Negative");}

        else{System.out.println("Number is Zero");}
}}

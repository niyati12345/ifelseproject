import java.util.Scanner;

public class AverageNumber {

    public static void main(String args[]) {
        System.out.println("Enter first number");
        Scanner number = new Scanner(System.in);
       int a=number.nextInt();
        System.out.println("Enter second number");
        int b=number.nextInt();
        System.out.println("Enter third number");
        int c=number.nextInt();
        System.out.println("Enter fourth number");
        int d=number.nextInt();
        System.out.println("Enter fifth number");
        int e=number.nextInt();
        System.out.println("Average for all five number:"+((a+b+c+d+e)/5));

    }

}
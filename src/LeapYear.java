import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = scanner.nextInt();
        if ((a%4==0)&&(a%400==0))
        {System.out.println("This year is a leap year"); }
        else{ System.out.println("This is not leap year");}
}}
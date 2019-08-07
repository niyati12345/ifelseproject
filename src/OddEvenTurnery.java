import java.util.Scanner;

public class OddEvenTurnery {

    public static  void main (String args[])
    {System.out.println("Enter the First number");
    //inbuilt class Scanner is used so user can input the number
    Scanner scanner = new Scanner(System.in);
    int a= scanner.nextInt();
    System.out.println("Enter the second number");
    int b= scanner.nextInt();
    //use of turnery operator
    System.out.println((a%2==0?"The number is even" : "The number is odd"));
    System.out.println((b%2==0?"The number is even" : "The number is odd"));


    }
}

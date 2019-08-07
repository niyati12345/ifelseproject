import java.util.Scanner;

public class Arithmatic {

    public static void main (String args[])
    {
        //char x = '+';
        //char y = '*';
        //char z = '-';
        //char d = '/';


        Scanner arithmatic = new Scanner(System.in);
        System.out.println("Please enter any number ");
        int a = arithmatic.nextInt();
        System.out.println("Please enter any number");
        int b = arithmatic.nextInt();
        System.out.println("Enter the symbol");
          char c=arithmatic.next().charAt(0);
          //by adding symbol user get symbolic value
        if(c=='+'){
            System.out.println("addtion of two number:"+ (a+b)); }
         else if(c=='*'){
            System.out.println("multiplication of two number:"+ (a*b)); }
        else if(c=='-'){
            System.out.println("subtraction  of two number:"+ (a-b)); }
        else if(c=='/'){
            System.out.println("Division  of two number:"+ (a/b)); }
else{System.out.println("invalid input");}
    }
}

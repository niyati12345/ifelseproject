import java.util.Scanner;

public class InterchangeValue {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=scanner.nextInt();
        System.out.println("Enter the value of y");
        int y=scanner.nextInt();
//swaping the value of x and y
        System.out.println("Before Swapping\nx = " + x   + "\ny = " +y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after Swapping\nx = " +  x    + "\ny = " +y);
    }
}



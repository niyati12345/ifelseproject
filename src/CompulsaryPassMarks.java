import java.util.Scanner;

public class CompulsaryPassMarks {

   public static void main(String args[])
   {System.out.println("Enter the student name");
       Scanner scanner = new Scanner(System.in);
       String name = scanner.next();
       //Created int
       System.out.println("Enter the roll no");
       int roll = scanner.nextInt();
       System.out.println("Enter the science marks");
       double sm = scanner.nextDouble();
       System.out.println("Enter the maths marks");
       double mm = scanner.nextDouble();
       System.out.println("Enter the english marks");
       double em = scanner.nextDouble();
       //use of concentination
       System.out.println("Total marks of three subject" + "=" + (sm + mm + em));
       System.out.println("Total percentage" + "=" + ((sm + mm + em) / (3)) + "%");
       //use of if else conditional statement
       if ((sm + mm + em) / (3) >= 35&&(sm>=35)&&(mm>=35)&&(em>=35)) {
           System.out.println("the result is pass"); }
       else {
           System.out.println("the result is fail"); }}}
       /*System.out.print("the grade is ");
       if ((sm + mm + em) / (3) >= 80) {
           System.out.print("A+");
       } else if (((sm + mm + em) / (3) >= 60)) {
           System.out.print("A");
       } else if (((sm + mm + em) / (3) >= 50)) {
           System.out.print("B");
       } else if (((sm + mm + em) / (3) >= 35)) {
           System.out.print("C");
       }
       else{

   }*/


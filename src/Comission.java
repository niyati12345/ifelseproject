import java.util.Scanner;

public class Comission {
    public static void main(String args[]) {
        Scanner salescommission = new Scanner(System.in);
        System.out.println("Enter sales ID:");
        int salesid = salescommission.nextInt();
        System.out.println("Enter Seller name");
        String sellername = salescommission.next();
        System.out.println("Enter sales amount");
        double salesamount = salescommission.nextDouble();
        System.out.println("Enter the basic salary:" + "\n £");
        double basicsalary = salescommission.nextDouble();
        if (salesamount >= 50000) {
            System.out.println("The commision is:" + (salesamount * 35) / 100);
        } else if (salesamount >= 30000) {
            System.out.println("The commission is" + (salesamount * 20) / 100);
        } else if (salesamount >= 20000) {
            System.out.println("The commission is"+ (salesamount*10)/100);
        }
        else if (salesamount >= 10000) {
            System.out.println("The commission is"+ (salesamount*5)/100);
        }
        else if (salesamount < 10000) {
            System.out.println("The commission is"+ (salesamount*2)/100);}

    }
}


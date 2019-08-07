import java.util.Scanner;

public class GrossSalary {

        static double hra;
        static double da;
        static double ta;
        static double pf;


        public static void main(String[]args){
        {
            Scanner grosssalary = new Scanner (System.in);
            System.out.println("Input Employee ID: ");
            int employeeid = grosssalary.nextInt();
            System.out.println("Enter a Name");
            String name = grosssalary.next();
            System.out.println("Please enter Salary");
            double salary = grosssalary.nextDouble();

            System.out.println("Finding HRA:" + (hra = (salary*10)/100));
            System.out.println("Finding DA:" + (da = (salary*8)/100));
            System.out.println("Finding TA" + (ta = (salary*9)/100));
            System.out.println("Finding PF" + (pf = (salary*20)/100));
            System.out.println("Finding Gross Salary:" + (salary+hra+da+ta-pf));
        }

    }
}

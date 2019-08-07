import java.util.Scanner;

public class AlphabetCase {

    public static void main (String args[]){
        //program for alphabet in uppercase and print it in lowercase
        Scanner alphabet=new Scanner(System.in);
        System.out.println("Input any alphabet in uppercase :");
        String name=alphabet.next();

        //System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}

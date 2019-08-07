import java.util.Scanner;

public class AlphabetSymbolNumber {
    public static void main(String args[]) {
        Scanner alphabet = new Scanner(System.in);
        System.out.println("Enter any character");
        char c = alphabet.next().charAt(0);

        //char c = '*';
        if ((c >= 0) && (c <= 9)) {
            System.out.println(c+"is an number");
        }
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c+ " is an alphabet.");
        } else {
            System.out.println(c + " is an symbol");
        }

    }
}
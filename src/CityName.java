import java.util.Scanner;

public class CityName {

    public static void main(String args[]){
        Scanner alphabet=new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F");
        char x=alphabet.next().charAt(0);


        if(x=='a'||x=='A')
        {
            System.out.println("the city is ahmedabad");
        }
        else if(x=='b'||x=='B'){
            System.out.println("the city is banglore ");
        }
        else if(x=='c'||x=='C'){
            System.out.println("the city is calcutta");
        }
        else if(x=='d'||x=='D')
        {
            System.out.println("the city is DELHI");
        }
        else if(x=='e'||x=='E')
        {
            System.out.println("the city is EDER");
        }
        else if(x=='f'||x=='F') {
            System.out.println("the city is FERINGTON");}
            else{
                System.out.println("invalid entry");
            }

        }}
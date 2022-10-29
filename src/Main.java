import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //welcome message
        Scanner scn = new Scanner(System.in);
        System.out.print("WELCOME TO IIT TIRUPATI BANKING SERVICE");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("\r");
        System.out.print("We are glad to be at your service!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("\r");

        //taking account number input
        int tries = 3;
        int accno = 0;
        while(accno < 9999 || accno > 99999 || tries > 0){
            System.out.print("Please type in your 5 - digit account number: ");
            accno = scn.nextInt();
            tries--;
            if(accno < 9999 || accno > 99999) System.out.println("Please enter valid account number!");
            else tries = 0;
        }

        //taking pin input
        tries = 3;
        int pinno = 0;

    }
}
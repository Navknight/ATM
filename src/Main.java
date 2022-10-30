import java.util.Scanner;
import java.io.*;

public class accounts{
    
}

public class Main {
    public static void main(String[] args) throws IOException {
        //welcome message
        Scanner scn = new Scanner(System.in);
        System.out.println("WELCOME TO IIT TIRUPATI BANKING SERVICE");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("We are glad to be at your service!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //taking account number input
        int tries = 3;
        int acc = 0;
        while(acc < 9999 || acc > 99999 || tries > 0){
            System.out.println("Please type in your 5 - digit account number: ");
            acc = scn.nextInt();
            tries--;
            if(acc < 9999 || acc > 99999) System.out.print("Please enter valid account number!");
            else tries = 0;
        }

        //taking pin input
        tries = 3;
        int pin = 0;
        System.out.println("Please type in you pin: ");
        pin = scn.nextInt();

        //checking if account number and pin are correct
        //to be done
        
        //taking user choice 
        System.out.println("Please select the appropriate option: ");
        System.out.println("1)Withdraw money\n2)Deposit Money\n3)View Bank Balance\n4)Change account PIN");
        int choice = scn.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the amount you want to withdraw: ");
                int amount = scn.nextInt();
                break;
            case 2:
                System.out.println("Enter the amount you want to deposit: ");
                int amount = scn.nextInt();
                break;
            case 3:
                System.out.println("You bank balance is: ");
                break;
            case 4:
                System.out.println("Please enter the new pin: ");
                int newpin = scn.nextInt();
                break;
        }
    }
}
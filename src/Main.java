import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        //reading the data
        List<List<String>> data = new ArrayList<>();
        Reader r = new Reader();
        r.reader("C:\\Users\\abhig\\OneDrive - iittp.ac.in\\Documents\\Clg Docs\\Sem 3\\Programming\\ATM\\src\\Database.csv", data);

        //welcome message
        System.out.println("WELCOME TO IIT TIRUPATI BANKING SERVICE");
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("We are glad to be at your service!");
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int t = 3;
        boolean matched = false;
        int accind=0;
        String acc;
        String pin;
        while(t-- > 0 && !matched){
            //taking account number input
            int tries = 3;
            int accno = 0;
            while(accno < 9999 || accno > 99999 || tries > 0){
                System.out.println("Please type in your 5 - digit account number: ");
                accno = scn.nextInt();
                tries--;
                if(accno < 9999 || accno > 99999) System.out.println("Please enter valid account number!");
                else tries = 0;
            }

            //taking pin input
            tries = 3;
            int pinno = 0;
            System.out.println("Please type in your pin: ");
            pinno = scn.nextInt();

            acc = Integer.toString(accno);
            pin = Integer.toString(pinno);
            //checking if account number and pin are correct
            for(int i = 1; i < data.size(); i++){
                if (data.get(i).get(0).equals(acc) && data.get(i).get(1).equals(pin)) {
                    accind = i;
                    matched = true;
                    break;
                }
            }
        }
        //tries expired
        if(t<0 && !matched){
            System.out.println("You have entered incorrect details too many times!\nEXITING!");
            return;
        }

        //taking user choice 
        System.out.println("Please select the appropriate option: ");
        System.out.println("1)Withdraw money\n2)Deposit Money\n3)View Bank Balance\n4)Change account PIN");
        int choice = scn.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the amount you want to withdraw: ");
                int wamount = scn.nextInt();
                if(wamount <= Integer.parseInt(data.get(accind).get(2)))
                    System.out.println("Earn more!");
                else{
                System.out.println("Your amount has been withdrawn, Please collect it from the tray!");
                data.get(accind).set(2, Integer.toString(Integer.parseInt(data.get(accind).get(2)) - wamount));
                }
                System.out.println("Your remaining balance is: "+data.get(accind).get(2));
                break;
            case 2:
                System.out.println("Enter the amount you want to deposit: ");
                int damount = scn.nextInt();
                data.get(accind).set(2, Integer.toString(Integer.parseInt(data.get(accind).get(2)) + damount));
                System.out.println("Your balance is: "+data.get(accind).get(2));
                break;
            case 3:
                System.out.println("You bank balance is: " + data.get(accind).get(2));
                break;
            case 4:
                System.out.println("Please enter the new pin: ");
                int newpin = scn.nextInt();
                data.get(accind).set(1, Integer.toString(newpin));
                System.out.println("Your PIN has been updated!");
                break;
        }
    }
}

import java.util.*;

class ATM{

    float Balance;
    int PIN = 7549;

    public void checkpin(){
        System.out.println("Enter your PIN :");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if(enteredpin == PIN){
            menu();
        }

        else{
            System.out.println("Enter a valid pin");
        }
    }

    public void menu(){
        System.out.println("Enter your choice :");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw3 Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc= new Scanner(System.in);
        int opt =sc.nextInt();

        if(opt ==1){
            checkBalance();
        }

        else if(opt == 2){
            withdrawMoney();
        }

        else if(opt == 3){
            depositMoney();
        }

        else if(opt == 4){
            return;
        }

        else{
            System.out.println("Enter a valid option");
        }
    }

    public void checkBalance(){
        System.out.println("Balance : "+ Balance);
        menu();
    }

    public void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to Withdraw :");
        int amount = sc.nextInt();

        if(amount<Balance){
            Balance = Balance - amount;
            System.out.println("Money Withdrawed Successfully :) ");
            System.out.println("Remaining Balance is :"+Balance );
             menu();
        }

        else{
            System.out.println("Insufficient Balance");
            System.out.println("Your balance is :"+ Balance);
            menu();
        }
    }

    public void depositMoney(){
        System.out.println("Enter your amount : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully :) ");
        System.out.println("Your new Balance is : "+ Balance);
        menu();
    }
}

public class ATMmachine{
    public static void main(String [] args){
        ATM obj = new ATM();
        obj.checkpin();
    }
}
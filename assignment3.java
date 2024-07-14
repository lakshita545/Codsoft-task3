import java.util.Scanner;
import java.io.*;

class UserBankAccount {
    int balance = 50000;
}

class ATM_Machine extends UserBankAccount {

    void withdraw(int withdrawAmount) {
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money");
            System.out.println("Your balance is:" + balance);
            System.out.println();
        }
        if (withdrawAmount == balance) {

            System.out.println("Your bank balance will become null");
            System.out.println("Your balance is:" + balance);
            System.out.println();
        }
        if (withdrawAmount > balance) {
            System.out.println("Insufficient Funds!!!");
            System.out.println("Your balance is:" + balance);
            System.out.println();
        }

    }

    void deposit(int x) {
        balance += x;
        System.out.println("Your balance is:" + balance);
        System.out.println();
    }

}

public class assignment3 {
    public static void main(String args[]) {
        ATM_Machine atm = new ATM_Machine();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(" ATM MACHINE WELCOMES YOU!!");
            System.out.println("How can I help you?");
            System.out.println("Following are the operations I can perform");
            System.out.println("Choose 1 for Check your Balance");
            System.out.println("Choose 2 for Withdraw Money");
            System.out.println("Choose 3 for Deposit Money");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            // while(choice<'1'|| choice>'3');
            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance is:" + atm.balance);
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn :");
                    int num1 = sc.nextInt();
                    atm.withdraw(num1);

                    break;
                case 3:
                    System.out.println("Enter the amount to be deposited :");
                    int num2 = sc.nextInt();
                    atm.deposit(num2);
                    break;
                case 4:
                    System.exit(0);

            }
            if (choice > 4) {
                System.out.println("Invalid Choice");
            }
        }
    }
}

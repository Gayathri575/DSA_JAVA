package MiniProject;
import java.util.Scanner;

class backHDFC {
    private String accountNumber;
    private String accoutName;
    private double balance;

    backHDFC(String accountNumber, String accoutName) {
        this.accountNumber = accountNumber;
        this.accoutName = accoutName;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccoutName() {
        return accoutName;
    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankingManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== Welcome ===========");
        System.out.println("Enter your Account Number :");
        String accountNumber = sc.next();
        System.out.println("Enter your AccountHolder Name :");
        String accoutName = sc.next();

        backHDFC HDFC = new backHDFC(accountNumber, accoutName);

        while (true) {
            System.out.println("\n========== Banking Menu ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + HDFC.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to Deposit:");
                    double da = sc.nextDouble();
                    HDFC.depositAmount(da);
                    break;
                case 3:
                    System.out.println("Enter amount to Withdraw:");
                    double wa = sc.nextDouble();
                    HDFC.withdrawAmount(wa);
                    break;
                case 4:
                    System.out.println("Exited!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid entry.");
            }
        }
    }
}

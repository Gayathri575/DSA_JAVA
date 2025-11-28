import java.util.Scanner;

class bankingSystem {

    // Static inner class for account details
    static class bankingManagement {
        private String accountHolderName;
        private String accountHolderNumber;
        private double amountBalance; // balance store panna

        // Constructor
        bankingManagement(String accountHolderName, String accountHolderNumber) {
            this.accountHolderName = accountHolderName;
            this.accountHolderNumber = accountHolderNumber;
            this.amountBalance = 0.0; // default balance
        }

        // Getter for balance
        public double getAmountBalance() {
            return amountBalance;
        }

        // toString method
        public String toString() {
            return "AccountHolderName: " + accountHolderName +
                    " | AccountHolderNumber: " + accountHolderNumber +
                    " | Available Balance: " + amountBalance;
        }
    }

    // Deposit money → object pass panna vendiyathu
    public void depositMoney(bankingManagement bm, double abalnce) {
        if (abalnce > 0) {
            bm.amountBalance += abalnce; // balance update
            System.out.println(abalnce + " Deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money → object pass panna vendiyathu
    public void withdrawMoney(bankingManagement bm, double abalnce) {
        if (abalnce > 0 && abalnce <= bm.amountBalance) {
            bm.amountBalance -= abalnce;
            System.out.println("Amount Withdrawn: " + abalnce);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Add account details → return banking object
    private static bankingManagement addAccDetails(Scanner sc) {
        System.out.println("Add accountHolderName:");
        String accountHolderName = sc.nextLine();

        System.out.println("Add accountHolderNumber:");
        String accountHolderNumber = sc.nextLine();

        return new bankingManagement(accountHolderName, accountHolderNumber); // return object
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankingSystem bankApp = new bankingSystem(); // object to call non-static methods
        bankingManagement bmObj = null; // account object

        int choice = 0;

        while (true) {
            displayBankMenu();
            choice = sc.nextInt();
            sc.nextLine(); // Scanner nextLine fix

            switch (choice) {
                case 1:
                    System.out.println("==== Welcome to Bank Application ====");
                    bmObj = addAccDetails(sc); // create account object
                    break;
                case 2:
                    if (bmObj != null) {
                        System.out.println("Available Balance: " + bmObj.getAmountBalance());
                    } else {
                        System.out.println("Add account first!");
                    }
                    break;
                case 3:
                    if (bmObj != null) {
                        System.out.println("Enter amount to deposit:");
                        double abalnce = sc.nextDouble();
                        bankApp.depositMoney(bmObj, abalnce); // object pass panna
                    } else {
                        System.out.println("Add account first!");
                    }
                    break;
                case 4:
                    if (bmObj != null) {
                        System.out.println("Enter amount to withdraw:");
                        double abalnce = sc.nextDouble();
                        bankApp.withdrawMoney(bmObj, abalnce); // object pass panna
                    } else {
                        System.out.println("Add account first!");
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Display menu
    private static void displayBankMenu() {
        System.out.println("========= Bank Menu ==========");
        System.out.println("1. Add Account Details");
        System.out.println("2. Check Balance");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Withdraw Amount");
        System.out.println("5. Exit");
    }
}

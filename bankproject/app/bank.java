package bankproject.app;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to Bank");
        while (running) {
            System.out.println("1) Open Account");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) Transfer");
            System.out.println("5) Account Statements");
            System.out.println("6) List Accounts");
            System.out.println("7) Search Account by Customer Name");
            System.out.println("0) Exit");

            System.out.print("CHOOSE YOUR OPTION : ");
            String choice = scanner.nextLine().trim();
            System.out.println("Your choice :" + choice);

            switch (choice) {
                case "1" -> openAccount(scanner);
                case "2" -> deposit(scanner);
                case "3" -> withdraw(scanner);
                case "4" -> transfer(scanner);
                case "5" -> statement(scanner);
                case "6" -> listAccounts(scanner);
                case "7" -> searchAccounts(scanner);
                case "0" -> running = false;
            }
        }
        scanner.close();




    }

    private static void openAccount(Scanner scanner) {
        System.out.println("Customer name : ");
        String name = scanner.nextLine().trim();
        System.out.println("Customer email : ");
        String email = scanner.nextLine().trim();
        System.out.println("Account Type (SAVINGS/CURRENT): ");
        String type = scanner.nextLine().trim();
        System.out.println("Initial Deposit (optional blank for zero) ");
        String amountStr = scanner.nextLine().trim();
        Double initial = Double.valueOf(amountStr);
        
    }

    private static void deposit(Scanner scanner) {
        
    }

    private static void withdraw(Scanner scanner) {
        
    }

    private static void transfer(Scanner scanner) {
        
    }

    private static void statement(Scanner scanner) {
        
    }

    private static void listAccounts(Scanner scanner) {
        
    }

    private static void searchAccounts(Scanner scanner) {
        
    }
}

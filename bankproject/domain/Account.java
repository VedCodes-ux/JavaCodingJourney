package bankproject.domain;

public class Account {
    private String accountNumber;
    private String customerID;
    private Double balance;
    private String AccountType;

    public Account(String accountNumber, String customerID, Double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.balance = balance;
        AccountType = accountType;
    };

    
}

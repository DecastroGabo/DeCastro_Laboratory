class BankAccount {
    private String accountHolderName;
    private double balance;

 //Constructor
    public BankAccount(String accountHolderName, double initialBalance){
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance; 

    }
    //Encapsulation: getter and setter methods
    public String getAccountHolderName() {
    return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    }
    public double getBalance(){
    return balance;
    }

    //method to deposit money
    public void deposit(double amount){
        if (amount > 0){
            balance += amount ;
            System.out.println("Deposited Amount:" + amount);
        }   
        else {
            System.out.println("Invalid deposit amount.");
        } 
    }
    //Method to withdraw money
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn Amount:" + amount);
        }
        else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
    //polymorphism: overriding method
    public void displayAccountDetails() {

        System.out.println("Account holder:" + accountHolderName);
        System.out.println("Balance:" + balance);
    }

}

//Child class SavingsAccount
class SavingsAccount extends BankAccount{ 
    private double interestRate; 

    //constructor
    public SavingsAccount(String accountHolderName, double initialBalance, double interestRate){
        super(accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    //method to calculate interest
    public void calculateInterest(){
        double interest = getBalance() * interestRate / 100;
        deposit(interest);

        System.out.println("Interest Earned:" + interest);

    }
    //Overriding displayAccountDetails Method 
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate:" + interestRate + "%");
    }
}

//  Child class: Current Account
class CurrentAccount extends BankAccount{
    private double overdraftLimit;
    //constructor 
    public CurrentAccount(String accountHolderName, double initialBalance, double overdraftLimit ){
        super(accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    //Overriding withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            double newBalance = getBalance()- amount;
            if (newBalance < 0) {
                overdraftLimit += newBalance;
            }
        
        super.deposit(-amount);
        
        System.out.println("Withdrawn Amount:" + amount);
        }
        else {
            System.out.println("Invalid withdrawal amount or overdraft limit exceeded.");
        }
    }

    //overriding displayAccountDetails Method
    @Override
    public void displayAccountDetails(){
        super.displayAccountDetails();
        System.out.println("Overdraft Limit:" + overdraftLimit);
    }
}

//Main Class to test the banking system

public class decastro_oop {
    public static void main(String[] args) {
    
        //Creating a Saving Account
        SavingsAccount savings = new SavingsAccount("mark", 5000, 3);
        savings.displayAccountDetails();
        savings.deposit(5000);
        savings.calculateInterest();
        savings.withdraw(5000);
        System.out.println();

        //Creating a Current Account
            CurrentAccount current = new CurrentAccount("John", 5000, 1000);
            current.displayAccountDetails();
            current.withdraw(1500);
            current.withdraw(500);

            current.displayAccountDetails();
    }
    
} 
    

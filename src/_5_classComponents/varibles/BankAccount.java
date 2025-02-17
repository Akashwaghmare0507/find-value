package _5_classComponents.varibles;

public class BankAccount {
    int customerId;
    int accountNumber;
    String customerName;
    int balance;
    static String bankName = "SBI";

    public static void main(String[] args) {
        System.out.println(BankAccount.bankName);

        BankAccount bankAccount = new BankAccount();
        bankAccount.customerId = 101;
        bankAccount.accountNumber = 1234;
        bankAccount.customerName = "Sachin";
        bankAccount.balance = 1000;

        System.out.println("Customer ID: " + bankAccount.customerId);
        System.out.println("Customer Account Number : " + bankAccount.accountNumber);
        System.out.println("Customer Name : "+bankAccount.customerName);
        System.out.println("Customer Bank balance :  " +bankAccount.balance);

    }
}

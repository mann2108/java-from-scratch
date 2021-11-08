package com.oopconcepts;

public class Bank {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank() {
        this("Mann Mehta", "301102230441", 0, "mannmehta2199@gmail.com", "1123311233");
    }

    public Bank(String customerName, String accountNumber, int balance, String email, String phoneNumber) {
        this.setAccountNumber(accountNumber);
        this.setCustomerName(customerName);
        this.setBalance(balance);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }

    public void getAccountDetails() {
        System.out.println(this.getAccountNumber());
        System.out.println(this.getBalance());
        System.out.println(this.getPhoneNumber());
        System.out.println(this.getCustomerName());
        System.out.println(this.getEmail());
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void depositAmount(int amount) {
        this.balance += amount;
        System.out.println("Deposit successful !! Available Balance: " + this.balance);
    }

    public void withdrawAmount(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdraw successful !! Available Balance: " + this.balance);
        }
        else
            System.out.println("Not Sufficient Balance !!");
    }
}

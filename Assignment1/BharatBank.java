package com.tw.assignment1;

public class BharatBank {

    public static void main(String[] args) {
        BharatBankInterestCalculator gopalAccount= new BharatBankInterestCalculator(50000,"current");
        BharatBankInterestCalculator amritaAccount = new BharatBankInterestCalculator(100000,"savings");
        gopalAccount.deposit(10000);
        amritaAccount.withdraw(45000);
        System.out.println(gopalAccount.getQuarterlyInterest());
        System.out.println(amritaAccount.getQuarterlyInterest());
        gopalAccount.withdraw(70000);
        System.out.println(gopalAccount.getBalance());
        System.out.println(amritaAccount.getBalance());
    }
}

class BharatBankInterestCalculator {
    private double balance;
    String accountType;

    public BharatBankInterestCalculator(double balance, String accountType) {
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {

        this.balance += this.getQuarterlyInterest();
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            if (this.accountType.equalsIgnoreCase("current") && this.balance > 0 && amount <= this.balance * 1.2) {
                this.balance -= amount;
            } else {
                System.out.println("Not Sufficient Balance");
            }
        }
    }

    public double getQuarterlyInterest() {
        if (this.accountType.equalsIgnoreCase("current")) {
            return 0;
        } else {
            return (this.balance * 0.03) / 4;
        }
    }

    public double getBalance() {
        return balance;
    }
}

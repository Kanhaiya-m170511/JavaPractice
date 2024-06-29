package com.learn.oop.bank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 7. Write a Java program to create a class called "Bank"
 * with a collection of accounts and methods to
 * add and remove accounts, and to deposit and withdraw money.
 * Also define a class called "Account" to maintain account
 * details of a particular customer.
 */
public class Bank {

    private List<Account> accountList = new LinkedList<>();

    public void addAccount(Account account){
        accountList.add(account);
    }
    public boolean removeAccount(Account account){
        return accountList.remove(account);
    }
    public List<Account> getAccounts(){
        return accountList;
    }

    public void deposit(String accId, Double balance) {
        for (Account account : accountList) {
            if (account.getAccId().equals(accId)) {
                account.deposit(balance);
                System.out.println("Deposit Successful !!  Total Balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Deposit not Successful !! Account Not Found");
    }

    public void withdraw(String accId, Double balance) {
        for (Account account : accountList) {
            if (account.getAccId().equals(accId) && account.withdraw(balance)) {
                System.out.println("Withdrawal Successful !!  Total Balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Withdrawal not Successful !!");
    }


}
class Account{
    private String accHolderName;
    private String accId;
    private AccountType accountType;
    private Double balance;

    public Account(String accHolderName, AccountType acType, Double initialBalance){
        this.accHolderName = accHolderName;
        this.accId = String.valueOf(10000001 + (int)(Math.random() * ((99999999 - 10000001) + 1)));
        this.accountType = acType;
        this.balance = initialBalance;
    }
    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double depositBal){
        this.balance += depositBal;
    }

    public boolean withdraw(Double withdrawalAmount){
        if(withdrawalAmount > balance){
            return false;
        }
        this.balance -= withdrawalAmount;
        return true;
    }

    @Override
    public String toString(){
        return accId+" "+accHolderName+" "+accountType+" "+balance;
    }
}

enum AccountType{
    SAVING,CURRENT,DIGITAL_SAVING,SALARY
    ;
}

class Test{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(new Account("Kanha", AccountType.SAVING,1700.89));
        List<Account> accounts = bank.getAccounts();

        Iterator<Account> accountIterator = accounts.listIterator();
        String accId = null;
        while (accountIterator.hasNext()){
            Account account = accountIterator.next();
            System.out.println(account);
            accId = account.getAccId();
        }

        bank.deposit(accId,1220.90);

        accountIterator = accounts.listIterator();

        while (accountIterator.hasNext()){
            Account account = accountIterator.next();
            System.out.println(account);
        }

        bank.withdraw(accId,10009.90);

        accountIterator = accounts.listIterator();

        while (accountIterator.hasNext()){
            Account account = accountIterator.next();
            System.out.println(account);
        }

    }
}
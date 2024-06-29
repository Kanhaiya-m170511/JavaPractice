package com.learn.oop.abstraction;

/*
 3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
 Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.

 */
public abstract class BankAccount {

    public abstract void deposit();
    public abstract void withdraw();
}

class SavingAccount extends BankAccount{

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }
}

class CurrentAccount extends BankAccount{

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }
}
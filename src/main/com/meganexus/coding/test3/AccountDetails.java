package com.meganexus.coding.test3;


import java.util.Iterator;

public class AccountDetails {

    private Account account;

    public void print() {

        // print summary
        System.out.println("Account: " + account.getId());
        System.out.println("Balance: " + account.getBalance());

        // print history
        for (Iterator iterator = account.getTransactions().iterator(); iterator.hasNext();) {

            Transaction tx = (Transaction) iterator.next();

            System.out.println("Type: " + tx.getType() + "Date: " + tx.getDate().toString() + " Amount: " + tx.getAmount().toString());
        }
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

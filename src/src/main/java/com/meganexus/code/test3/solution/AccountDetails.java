package com.meganexus.code.test3.solution;


import com.meganexus.code.test3.Account;
import com.meganexus.code.test3.Transaction;

import java.util.Iterator;

public class AccountDetails {

    private Account account;

    public void print() {

        printSummary();
        printHistory();
    }

    private void printHistory() {

        for (Iterator iterator = account.getTransactions().iterator(); iterator.hasNext();) {

            Transaction tx = (Transaction) iterator.next();

            System.out.println("Type: " + tx.getType() + "Date: " + tx.getDate().toString() + " Amount: " + tx.getAmount().toString());
        }
    }

    private void printSummary() {

        System.out.println("Account: " + account.getId());
        System.out.println("Balance: " + account.getBalance());
    }



    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

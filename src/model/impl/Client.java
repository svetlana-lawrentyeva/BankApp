package model.impl;

import model.Account;
import model.Report;

import java.util.ArrayList;
import java.util.List;

/**
 * Created:
 * User: Svetlana Lawrentyeva
 * Date: 1/24/15
 * Time: 12:53 PM
 */
public class Client implements Report {
    private String name;
    private Account activeAccount;
    private List<Account> accounts = new ArrayList<Account>();

    public void printReport() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(Account activeAccount) {
        this.activeAccount = activeAccount;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Client: ").append(name);
        for (Account account:accounts){
            builder.append("\n").append(account);
            if(account.equals(activeAccount)) {
                builder.append(" < active account");
            }
        }
        builder.append("\n----");
        return builder.toString();
    }
}

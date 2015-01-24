package model.impl;

import model.Account;

/**
 * Created:
 * User: Svetlana Lawrentyeva
 * Date: 1/24/15
 * Time: 1:06 PM
 */
public class SavingAccount implements Account {
    private long id;
    private float balance;

    @Override public boolean equals(Object obj) {
        return (id == ((SavingAccount)obj).id);
    }

    public SavingAccount(float balance) {
        id = this.hashCode();
        this.setBalance(balance);
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float x) {
        setBalance(getBalance() + x);
    }

    public void withdraw(float x) {
        if(getBalance() >= x) {
            setBalance(getBalance() - x);
        }
    }

    public void printReport() {
        System.out.println(this);
    }

    @Override public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getSimpleName()).append(" #").append(id);
        builder.append(" balance: ").append(getBalance());

        return builder.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}


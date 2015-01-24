package model;

/**
 * Created:
 * User: Svetlana Lawrentyeva
 * Date: 1/24/15
 * Time: 12:55 PM
 */
public interface Account extends Report {
    float getBalance();

    void deposit(float x);

    void withdraw(float x);
}

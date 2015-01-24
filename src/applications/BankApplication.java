package applications;

import model.Account;
import model.impl.Bank;
import model.impl.Client;
import model.impl.SavingAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * Created:
 * User: Svetlana Lawrentyeva
 * Date: 1/24/15
 * Time: 1:10 PM
 */
public class BankApplication {
    private Bank bank;

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        bankApplication.initialize();
        bankApplication.printBankReport();
        bankApplication.modifyBank();
        System.out.println("-----------------after-modification-----------------");
        bankApplication.printBankReport();
    }

    public void initialize() {
        bank = new Bank();
        bank.setName("My bank");

        List<Client>clients = new ArrayList<>();
        clients.add(createClient("peter", 155));
        clients.add(createClient("ann", 200));
        clients.add(createClient("vlad", 600));
        clients.add(createClient("olga", 444));
        clients.add(createClient("ivan", 98));

        bank.setClients(clients);
    }

    private Client createClient(String name, float balance) {
        Client client = new Client();
        client.setName(name);

        List<Account> accounts = new ArrayList<>();

        Account account = new SavingAccount(balance);
        accounts.add(account);

        client.setAccounts(accounts);
        client.setActiveAccount(account);

        return client;
    }

    public void modifyBank() {
        bank.getClients().get(0).getAccounts().get(0).deposit(15523);
        bank.getClients().get(1).getAccounts().get(0).withdraw(200);
    }

    public void printBankReport() {
        bank.printReport();
    }
}

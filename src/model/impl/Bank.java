package model.impl;

import model.Report;

import java.util.ArrayList;
import java.util.List;

/**
 * Created:
 * User: Svetlana Lawrentyeva
 * Date: 1/24/15
 * Time: 12:54 PM
 */
public class Bank implements Report {

    private List<Client> clients = new ArrayList<>();
    private String name;

    public void printReport() {
        System.out.println(this);
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bank: ").append(name).append("\n");
        builder.append("Clients:").append("\n");
        for (Client client:clients){
            builder.append(client).append("\n");
        }
        return builder.toString();
    }
}

package be.ae.services.model;

import javax.persistence.Entity;

@Entity
public class Account {

    private String id;
    private String label;
    private Float amount;
    private AccountType type;

    public Account(String id) {
        this.id = id;
    }
}

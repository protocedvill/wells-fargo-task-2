package com.wellsfargo.counselor.entity;

import java.util.Collection;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne(mappedBy="Client.portfolio")
    private Client client;

    @OneToMany
    private Collection<Security> listOfSecurities;

    protected Portfolio() {

    }

    public Portfolio(Client client, Collection<Security> listOfSecurities) {
        this.client = client;
        this.listOfSecurities = listOfSecurities;
    }

    public Client getClient() {
        return client;
    }

    public Collection<Security> getSecurities() {
        return listOfSecurities;
    }

    public void setSecurities(Collection<Security> listOfSecurities) {
        this.listOfSecurities = listOfSecurities;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

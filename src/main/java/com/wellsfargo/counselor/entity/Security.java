package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    @OneToMany(mappedBy="Portfolio.listOfSecurities")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String catagory;

    @Column(nullable = false)
    private Date purchase_date;

    @Column(nullable = false)
    private Float purchase_price;

    @Column(nullable = false)
    private Integer purchase_quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio, String name, String catagory, Date purchase_date, Float purchase_price, Integer purchase_quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.catagory = catagory;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.purchase_quantity = purchase_quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public Float getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Float purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Integer getPurchase_quantity() {
        return purchase_quantity;
    }

    public void setPurchase_quantity(Integer purchase_quantity) {
        this.purchase_quantity = purchase_quantity;
    }
    
}

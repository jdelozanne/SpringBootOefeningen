/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author julia
 */
@Entity
public class Product {
    
    @Id
    @GeneratedValue
    private int id;
    private String productnaam;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getProductnaam() {
        return productnaam;
    }

    public void setProductnaam(String productnaam) {
        this.productnaam = productnaam;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julia.hellospring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Cheese {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @Size(min=3, max=15)
    private String cheeseName;
    @NotNull
    @Size(min=1, message = "Description shouldnt be empty")
    private String cheeseDescription;
    private CheeseType cheeseType;

    public Cheese() {
        
    }

    

    public Cheese(String cheeseName, String cheeseDescription) {
       
        this.cheeseName = cheeseName;
        this.cheeseDescription = cheeseDescription;
    }
    
    public int getId() {
        return id;
    }
    public String getCheeseName() {
        return cheeseName;
    }

    public void setCheeseName(String name) {
        this.cheeseName = name;
    }

    public String getCheeseDescription() {
        return cheeseDescription;
    }

    public void setCheeseDescription(String description) {
        this.cheeseDescription = description;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julia.hellospring.models;

public class Cheese {

    private String cheeseName;
    private String cheeseDescription;
    private int cheeseId;
    private static int nextId = 1;

    public Cheese() {
        cheeseId = nextId;
        nextId++;
    }

    public Cheese(String cheeseName, String cheeseDescription) {
        this();
        this.cheeseName = cheeseName;
        this.cheeseDescription = cheeseDescription;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
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
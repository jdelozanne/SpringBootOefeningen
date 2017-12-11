/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julia.hellospring.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julia
 */
public class CheeseData {
        static ArrayList<Cheese> cheeses = new ArrayList<>();

        //getAll
        public static List<Cheese> getAll(){
            return cheeses;
        }
        //add
        public static void addCheese(Cheese cheese){
            cheeses.add(cheese);
        }
        //remove
      public static void remove(int id){
         Cheese cheeseToRemove = getById(id);
         cheeses.remove(cheeseToRemove);
      }
        
        //getById
        public static Cheese getById(int id){
            Cheese cheeseCandidate = null;
            for(Cheese cheese: cheeses){
                if(cheese.getCheeseId() == id){
                    cheeseCandidate = cheese;
                }
            }
            return cheeseCandidate;
        }
}

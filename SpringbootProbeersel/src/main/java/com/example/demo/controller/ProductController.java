/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.models.data.ProductDao;
import com.example.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author julia
 */
@Controller
public class ProductController {
    
    @Autowired
    ProductDao productdao;
    
    //Model wordt hier gebruikt enkel voor de view, dus niet als object 
    @RequestMapping(value = "product", method= RequestMethod.GET)
    public String addNewProduct(Model model){
        model.addAttribute("title", "add product" );
       // model.addAttribute(new Product());
                return "/product";
    }
    //@ModelAttribute is een object, Product in dit geval
    //de invoer van de naam wordt nu afgehandeld in de view
    @RequestMapping(value ="product", method = RequestMethod.POST)
    public String processNewProduct(@ModelAttribute("product") Product product){
        productdao.save(product);
        return "redirect:";
    }
    
    
   
    
}

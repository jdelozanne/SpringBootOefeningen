/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julia.hellospring.controllers;


import com.julia.hellospring.models.Product;
import javax.servlet.http.HttpServletRequest;
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
    
    
    
    //Model wordt hier gebruikt enkel voor de view, dus niet als object 
    @RequestMapping(value = "product", method= RequestMethod.GET)
    public String addNewProduct(Model model){
        model.addAttribute("title", "add product" );
    
                return "cheese/product";
    }
    
    @RequestMapping(value="product", method = RequestMethod.POST)
    public String processNewProduct(@ModelAttribute Product p){
        //p.getProductnaam();
        return "redirect:";
    }
    
   
    
}

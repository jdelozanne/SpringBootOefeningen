/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julia.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author julia
 */
@Controller
@RequestMapping(value="cheese")
public class CheeseController {
    
    //we gebruiken model om parameters door te spelen aan de view
    @RequestMapping(value ="")
    public String index(Model model){
        model.addAttribute("titleIsTheTitleWeGive", "my Cheeses");
        return "cheese/index";
    }
    
}

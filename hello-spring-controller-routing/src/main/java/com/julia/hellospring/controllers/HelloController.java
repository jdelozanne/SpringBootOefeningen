/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julia.hellospring.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author julia
 */
@Controller
public class HelloController {
    
    @RequestMapping(value ="")
    @ResponseBody
    public String index(){
        return "Hithere";
    }
    
    @RequestMapping(value="hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloForm(){
        
        String html = "<form method= 'post' action='/try' >" +
                "<input type='text' name='surname' />" +
                "<input type='submit' value='Greet me!' />" +
                "</form>";
                
        return html;
    }
    
    @RequestMapping(value="try", method=RequestMethod.POST)
    @ResponseBody
    public String helloPost(HttpServletRequest request) {
        String name = request.getParameter("surname");
        
        return "hi "+ name;
    }
    
    //name in curlybraces says its a parameter in the url
    //@pathvariable tells to look in the path(url) and the variable name should match
    @RequestMapping(value= "hello/{name}")
    @ResponseBody
    public String helloUrlSegment(@PathVariable String name){
        return "hello" + name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.themercenaries.loginmechanism.controller;

import com.themercenaries.loginmechanism.dao.UserDAO;
import com.themercenaries.loginmechanism.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sumanheuju
 */
@Controller
@RequestMapping(value = "/admin/user")
public class UserController {
    @Autowired
    private UserDAO uDAO;
    @RequestMapping(value = "show",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("users",uDAO.getAll());
        return "admin/user/show";
    }
    
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("user", new User());
        return "admin/user/add";
    }
    
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@RequestParam(value = "userName") String username, 
                       @RequestParam(value = "email") String email,
                       @RequestParam(value = "password") String password,
                       @RequestParam(value = "status") String status,
                       Model model){
        
        User usr = new User();
        usr.setUserName(username);
        usr.setEmail(email);
        usr.setPassword(password);
        usr.setStatus(Boolean.parseBoolean(status));
        
        uDAO.insert(usr);
        
        return "redirect:show";
    }
}

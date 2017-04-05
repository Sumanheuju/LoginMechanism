/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.themercenaries.loginmechanism.controller;

import com.themercenaries.loginmechanism.dao.DepartmentDAO;
import com.themercenaries.loginmechanism.dao.UserDAO;
import com.themercenaries.loginmechanism.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sumanheuju
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}

package org.arpit.java2blog.controller;

import org.arpit.java2blog.model.Account;
import org.arpit.java2blog.model.User;
import org.arpit.java2blog.service.AccountService;
import org.arpit.java2blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AccountService accountService;


    @RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
    public String getUser(Model model) {

        List<User> listOfUsers = userService.findAll();
        model.addAttribute("user", new User());
        model.addAttribute("listOfUsers", listOfUsers);
        return "index";
    }

    @RequestMapping(value = "/getMaxAccount", method = RequestMethod.GET, headers = "Accept=application/json")
    public String getUserMaxAccount(Model model) {
        List<Account> maxAcc = accountService.maxAccount();
        model.addAttribute("account", new Account());
        model.addAttribute("maxAcc", maxAcc);
        return "richest";
    }
    @RequestMapping(value = "/getSumAccount", method = RequestMethod.GET, headers = "Accept=application/json")
    public String sumAccount(Model model){
        model.addAttribute("sum", accountService.sumAllAccounts());
        return "sumAcc";
    }
}

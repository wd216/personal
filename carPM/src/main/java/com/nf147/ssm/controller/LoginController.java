package com.nf147.ssm.controller;

import com.nf147.ssm.dao.CustomerMapper;
import com.nf147.ssm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private CustomerMapper cmapper;
    @Autowired
    private IndexController indexController;
    @Autowired
    private PageController pageController;

    @RequestMapping("/Login")
    @ResponseBody
    private String login(Customer customer,Model model){
        Customer newcustomer = cmapper.selectByNameAndPwd(customer);
        System.out.println(newcustomer);
        if (newcustomer != null ){
            model.addAttribute("news",newcustomer);
            return "1";
        }
        return "0";
    }
}

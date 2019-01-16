package com.nf147.ssm.controller;

import com.nf147.ssm.dao.CustomerMapper;
import com.nf147.ssm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    private String login(Customer customer, HttpServletRequest request){
        Customer newcustomer = cmapper.selectByNameAndPwd(customer);
//        System.out.println(newcustomer);
        if (newcustomer != null ){
           request.getSession().setAttribute("newcustomer",newcustomer);
           return "1";
        }
        return "0";
    }
    @RequestMapping("/Login/return")
    public String ret(HttpServletRequest request,Model model){
        request.getSession().setAttribute("newcustomer",null);
        return indexController.index(model);
    }
}

package com.nf147.ssm.controller;

import com.nf147.ssm.dao.BookMapper;
import com.nf147.ssm.dao.BooktypeMapper;
import com.nf147.ssm.entity.Book;
import com.nf147.ssm.entity.Booktype;
import com.nf147.ssm.entity.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.GET;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private BookMapper mapper;
    @Autowired
    private BooktypeMapper bmapper;


    private ReturnData data = new ReturnData();


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String all(Model model){

        List<Book> books = mapper.selectAll();
        List<Booktype> booktypes = bmapper.selectAll();
        data.setBooks(books);
        data.setBtypes(booktypes);
        model.addAttribute("data",data);
        return "index";
    }

}

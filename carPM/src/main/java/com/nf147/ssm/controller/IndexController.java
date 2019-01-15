package com.nf147.ssm.controller;

import com.nf147.ssm.dao.BookMapper;
import com.nf147.ssm.dao.BooktypeMapper;
import com.nf147.ssm.entity.Book;
import com.nf147.ssm.entity.Booktype;
import com.nf147.ssm.wrappeClass.ReturnData;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private BookMapper mapper;
    @Autowired
    private BooktypeMapper bmapper;
    private ReturnData data = new ReturnData();


    @RequestMapping(value = "/index/{id}")
    public String byType(Model model,@PathVariable("id") String id){
//        用来接收书的集合，由于功能中有根据类型来找相关的书，所以我在访问路径中带参，用来判断
//        如果路径参数中有数据就查对应类型的书，没有就查询所有的书
//        好像没有用
        Integer nid = Integer.valueOf(id);
        List<Book> books = null;
        books = mapper.selectAll();
        if (nid > 0){
            books = mapper.selectByType(nid);
        }
        List<Booktype> booktypes = bmapper.selectAll();
        data.setBtypes(booktypes);
        data.setBooks(books);
        model.addAttribute("data",data);
        return "index";
    }

//     TODO 在搜索中停下了，因为想用到 ajax 进行无页面刷新，对 POST 的请求传参不是很懂哦
//    TODO 暂时放下搜索，坐登录
    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public String byName(Model model,@RequestParam("search") String name){
        // 查询多有的类型数据,并加入到 data 中
        List<Booktype> btypes = bmapper.selectAll();
        data.setBtypes(btypes);
        List<Book> books = null;
        Book book = mapper.selectByName(name);
        // 可能用户输入的书名在数据库中找不到的话，就把所有的书传过去
        if (book == null){
            books = mapper.selectAll();
        }else {
            books.add(book);
        }
        data.setBooks(books);
        model.addAttribute("data",data);
        return "index";
    }


    @RequestMapping("/index")
    public String index( Model model){
        List<Book> books = mapper.selectAll();
        List<Booktype> booktypes = bmapper.selectAll();
        data.setBtypes(booktypes);
        data.setBooks(books);
        model.addAttribute("data",data);
        return "index";
    }
}

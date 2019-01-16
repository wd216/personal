package com.nf147.ssm.controller;

import com.nf147.ssm.dao.OrderitemMapper;
import com.nf147.ssm.entity.Orderitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class OrderItemController {
    @Autowired
    private OrderitemMapper omapper;
    @Autowired
    private IndexController controller;
    // 要跳转到购物车页面首先，判断用户有没有登录，如果没有登录跳到登录页面让他登录
    // 如果用户登录了 则查询出用户购物的商品信息并展示给页面
    @RequestMapping("/orderItem/{id}")
    public String orderitem(@PathVariable("id")String id, Model model){
        // 用户登录的话，会把用户对象放到 Session 会话中，根据这个对象做判断
        // 如果不为空，则表示用户已经登录了，可以进入到购物页面
        // 没有登录的话让用户跳转到首页
        List<Orderitem> orderitems = null;
        if ("0".equals(id)){
            return controller.index(model);
        }
        Integer uid = Integer.valueOf(id);
        orderitems = omapper.selectByCusId(uid);
        model.addAttribute("orderitem",orderitems);
        return "cart";
    }
    @RequestMapping("/orderItem/add")
    public String addBook(Orderitem orderitem,Model model,HttpServletRequest request){
        Object attribute = request.getSession().getAttribute("newcustomer");
        if (attribute == null){
            return controller.index(model);
        }
        omapper.insert(orderitem);
        return "index";
    }
}










// 测试数据
//    @RequestMapping("/OrderItem/{id}")
//    @ResponseBody
//    public List<Orderitem> orderItem(){
//        List<Orderitem> orderitems = omapper.selectByCusId(1);
//        return orderitems;
//    }
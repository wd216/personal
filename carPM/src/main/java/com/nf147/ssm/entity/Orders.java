package com.nf147.ssm.entity;

import java.util.Date;

public class Orders {
    private String id;


    //oiid 用来确定订单是属于哪个购物车的
//    private Integer oiid;
    private Orderitem orderitem;
    //用户 id 用来判断这个订单属于哪个用户的
    private Customer customer;
//    private Integer aid;

    private Date ordertime;

    public Orderitem getOrderitem() {
        return orderitem;
    }

    public void setOrderitem(Orderitem orderitem) {
        this.orderitem = orderitem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

//    public Integer getOiid() {
//        return oiid;
//    }
//
//    public void setOiid(Integer oiid) {
//        this.oiid = oiid;
//    }

//    public Integer getAid() {
//        return aid;
//    }
//
//    public void setAid(Integer aid) {
//        this.aid = aid;
//    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }
}
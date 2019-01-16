package com.nf147.ssm.entity;

import java.math.BigDecimal;
import java.util.List;

public class Orderitem {
    private Integer id;

    private Customer customer;
//    private Integer uid;

    private Book book;
//    private Integer bid;

    private Integer state;

    private Integer num;

    private BigDecimal price;

//    public Orderitem(Integer uid, Integer bid, int i) {
//        this.num=i;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Integer getUid() {
//        return uid;
//    }
//
//    public void setUid(Integer uid) {
//        this.uid = uid;
//    }
//
//    public Integer getBid() {
//        return bid;
//    }
//
//    public void setBid(Integer bid) {
//        this.bid = bid;
//    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
package com.nfczh.ssmdemo01.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Book {
    private Integer id;

    private Integer bid;

    private String bname;

    private String author;

    private String image;

    private BigDecimal price;

    private String press;

    private Date presstime;

    private Integer pages;

    private Integer word;

    private Date printingtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    public Date getPresstime() {
        return presstime;
    }

    public void setPresstime(Date presstime) {
        this.presstime = presstime;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getWord() {
        return word;
    }

    public void setWord(Integer word) {
        this.word = word;
    }

    public Date getPrintingtime() {
        return printingtime;
    }

    public void setPrintingtime(Date printingtime) {
        this.printingtime = printingtime;
    }
}
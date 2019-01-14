package com.nfczh.ssm.entity;

import java.util.Date;

public class Orders {
    private String id;

    private Integer oiid;

    private Integer aid;

    private Date ordertime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getOiid() {
        return oiid;
    }

    public void setOiid(Integer oiid) {
        this.oiid = oiid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }
}
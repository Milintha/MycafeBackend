package com.boot.mycafe.cafe.Model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Curry {
    @Id
    @Column(name = "curry_id")
    private int curry_id;
    @Column(name = "curry_name")
    private String curry_name;
    @Column(name = "detail")
    private String detail;

    public Curry() {

    }

    public Curry(int curry_id, String curry_name, String detail) {
        this.curry_id = curry_id;
        this.curry_name = curry_name;
        this.detail = detail;
    }

    public int getCurry_id() {
        return curry_id;
    }

    public void setCurry_id(int curry_id) {
        this.curry_id = curry_id;
    }

    public String getCurry_name() {
        return curry_name;
    }

    public void setCurry_name(String curry_name) {
        this.curry_name = curry_name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

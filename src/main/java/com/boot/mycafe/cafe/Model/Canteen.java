package com.boot.mycafe.cafe.Model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Canteen {
    @Id
    @Column(name="canteen_id")
    private int canteen_id;
    @Column(name="auth_user_id")
    private int auth_user_id;
    @Column(name="name")
    private String name;
    @Column(name="open")
    private String open;
    @Column(name="close")
    private String close;
    @Column(name="notice")
    private String notice;

    public Canteen(int canteen_id, int auth_user_id, String name, String open, String close, String notice) {
        this.setCanteen_id(canteen_id);
        this.setAuth_user_id(auth_user_id);
        this.setName(name);
        this.setOpen(open);
        this.setClose(close);
        this.setNotice(notice);
    }

    public Canteen() {

    }



    public int getCanteen_id() {
        return canteen_id;
    }

    public void setCanteen_id(int canteen_id) {
        this.canteen_id = canteen_id;
    }

    public int getAuth_user_id() {
        return auth_user_id;
    }

    public void setAuth_user_id(int auth_user_id) {
        this.auth_user_id = auth_user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}

package com.boot.mycafe.cafe.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food")
public class Food {
    @Id
    @Column(name = "food_id")
    private int food_id;
    @Column(name="auth_user_id")
    private int auth_user_id;
    @Column(name = "name")
    private String name;



    public Food() {
    }

    public Food(int food_id, String name, int auth_user_id) {
        this.food_id = food_id;
        this.name = name;
        this.auth_user_id = auth_user_id;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuth_user_id() {
        return auth_user_id;
    }

    public void setAuth_user_id(int owner_id) {
        this.auth_user_id = auth_user_id;
    }
}

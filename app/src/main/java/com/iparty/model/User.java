package com.iparty.model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.Serializable;

/**
 * Created by Maurício Generoso on 18/10/2018
 */
public class User {


    private int id;
    private String name;
    private String email;
    private String password;
    private String confirmPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword; }

    public JsonObject getJson() {
        JsonObject json = new JsonObject();
        json.addProperty("id", this.id);
        json.addProperty("name", this.name);
        json.addProperty("email", this.email);
        return json;
    }

}
package com.raaziat.daggerdemo.model.signin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class signinRequest {
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;

    public String getEmail() {
        return email;
    }

    public signinRequest(String email,String password) {
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

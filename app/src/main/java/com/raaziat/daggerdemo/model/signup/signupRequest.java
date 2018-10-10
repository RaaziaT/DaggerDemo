package com.raaziat.daggerdemo.model.signup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class signupRequest {
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public signupRequest(String email,String password,String postalCode) {
        this.email = email;
        this.password = password;
        this.postalCode = postalCode;
    }
}

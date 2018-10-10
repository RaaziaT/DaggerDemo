package com.raaziat.daggerdemo.model.signup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignupResponse {
    @SerializedName("returnValue")
    @Expose
    private Integer returnValue;
    @SerializedName("status")
    @Expose
    private String status;

    public Integer getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Integer returnValue) {
        this.returnValue = returnValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

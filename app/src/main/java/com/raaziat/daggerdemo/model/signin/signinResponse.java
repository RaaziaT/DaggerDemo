package com.raaziat.daggerdemo.model.signin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class signinResponse {
    @SerializedName("cbId")
    @Expose
    private String cbId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("syndicateId")
    @Expose
    private String syndicateId;
    @SerializedName("emailUnsub")
    @Expose
    private String emailUnsub;
    @SerializedName("nid")
    @Expose
    private String nid;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("addr1")
    @Expose
    private String addr1;
    @SerializedName("addr2")
    @Expose
    private String addr2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("mobile_phone_number")
    @Expose
    private String mobilePhoneNumber;
    @SerializedName("email_retail")
    @Expose
    private Boolean emailRetail;
    @SerializedName("email_promo")
    @Expose
    private Boolean emailPromo;
    @SerializedName("email_coup")
    @Expose
    private Boolean emailCoup;
    @SerializedName("mobile_verified")
    @Expose
    private Boolean mobileVerified;
    @SerializedName("confirmed")
    @Expose
    private Boolean confirmed;
    @SerializedName("cashBackUser")
    @Expose
    private Boolean cashBackUser;
    @SerializedName("couponsUser")
    @Expose
    private Boolean couponsUser;

    public String getCbId() {
        return cbId;
    }

    public void setCbId(String cbId) {
        this.cbId = cbId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSyndicateId() {
        return syndicateId;
    }

    public void setSyndicateId(String syndicateId) {
        this.syndicateId = syndicateId;
    }

    public String getEmailUnsub() {
        return emailUnsub;
    }

    public void setEmailUnsub(String emailUnsub) {
        this.emailUnsub = emailUnsub;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public Boolean getEmailRetail() {
        return emailRetail;
    }

    public void setEmailRetail(Boolean emailRetail) {
        this.emailRetail = emailRetail;
    }

    public Boolean getEmailPromo() {
        return emailPromo;
    }

    public void setEmailPromo(Boolean emailPromo) {
        this.emailPromo = emailPromo;
    }

    public Boolean getEmailCoup() {
        return emailCoup;
    }

    public void setEmailCoup(Boolean emailCoup) {
        this.emailCoup = emailCoup;
    }

    public Boolean getMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(Boolean mobileVerified) {
        this.mobileVerified = mobileVerified;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Boolean getCashBackUser() {
        return cashBackUser;
    }

    public void setCashBackUser(Boolean cashBackUser) {
        this.cashBackUser = cashBackUser;
    }

    public Boolean getCouponsUser() {
        return couponsUser;
    }

    public void setCouponsUser(Boolean couponsUser) {
        this.couponsUser = couponsUser;
    }
}

package com.raaziat.daggerdemo.ui.signin;

import com.raaziat.daggerdemo.model.signin.signinRequest;

import retrofit2.Call;

public interface signinContract {
    interface SigInView{
        void showTost(String string);
    }
    interface SignInPresenter{
        void getSignInCredentials ( Call<signinRequest> networkrequest);
    }
}

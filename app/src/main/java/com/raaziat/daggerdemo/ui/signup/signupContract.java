package com.raaziat.daggerdemo.ui.signup;

import com.raaziat.daggerdemo.model.signup.signupRequest;

import retrofit2.Call;

public interface signupContract {
    interface SignUpView{
        void showToast(String string);
    }
    interface SignUpPresenter{
        void getSignUpCredentials(Call<signupRequest> networkrequest);
    }
}

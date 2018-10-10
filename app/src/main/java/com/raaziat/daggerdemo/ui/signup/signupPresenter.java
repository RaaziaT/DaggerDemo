package com.raaziat.daggerdemo.ui.signup;

import android.util.Log;

import com.raaziat.daggerdemo.model.signin.signinRequest;
import com.raaziat.daggerdemo.model.signup.signupRequest;
import com.raaziat.daggerdemo.network.NetworkRequestInterfaces;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class signupPresenter implements signupContract.SignUpPresenter {

    @Inject
    Retrofit retrofit;
    private signupContract.SignUpView signUpView;
    public signupPresenter(signupContract.SignUpView signUpView)
    {
        this.signUpView = signUpView;
    }

    @Override
    public void getSignUpCredentials(Call<signupRequest> networkrequest) {
        networkrequest.enqueue(new Callback<signupRequest>() {
            @Override
            public void onResponse(Call<signupRequest> call, Response<signupRequest> response) {
                if(response.isSuccessful())
                {
                    Log.i("SignUp","Successful");
                    signUpView.showToast("Successful");
                }
                else
                {
                    Log.i("SignUp"," Unsuccessful");
                    signUpView.showToast("UnSuccessful");
                }
            }

            @Override
            public void onFailure(Call<signupRequest> call, Throwable t) {
                Log.e("SignUp","Error",t);
                signUpView.showToast("Error"+ t);
            }
        });

    }
}

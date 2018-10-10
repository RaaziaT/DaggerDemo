package com.raaziat.daggerdemo.ui.signin;

import android.util.Log;

import com.raaziat.daggerdemo.model.signin.signinRequest;
import com.raaziat.daggerdemo.network.NetworkRequestInterfaces;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class signinPresenter implements signinContract.SignInPresenter {

    private signinContract.SigInView sigInView;

    public signinPresenter(signinContract.SigInView sigInView)
    {
        this.sigInView= sigInView;
    }

    @Override
    public void getSignInCredentials( Call<signinRequest> networkrequest) {
//        Call<signinRequest> networkrequest = retrofit.create(NetworkRequestInterfaces.class).SignIn(signInRequest);
        networkrequest.enqueue(new Callback<signinRequest>() {
            @Override
            public void onResponse(Call<signinRequest> call, Response<signinRequest> response) {
                if(response.isSuccessful()) {
                    Log.i("SignIn", "Successful");
                    sigInView.showTost("Successful");
                }
                else{
                    Log.i("SignIn","Unsuccessful");
                    sigInView.showTost("Unsuccessful");}
            }

            @Override
            public void onFailure(Call<signinRequest> call, Throwable t) {
                Log.e("SignIn","Error",t);
                sigInView.showTost("Error"+ t);

            }
        });
    }
}

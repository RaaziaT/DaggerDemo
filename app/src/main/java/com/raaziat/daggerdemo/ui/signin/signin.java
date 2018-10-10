package com.raaziat.daggerdemo.ui.signin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.raaziat.daggerdemo.R;
import com.raaziat.daggerdemo.app.App;
import com.raaziat.daggerdemo.model.signin.signinRequest;
import com.raaziat.daggerdemo.network.NetworkRequestInterfaces;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Retrofit;

public class signin extends AppCompatActivity implements View.OnClickListener, signinContract.SigInView {

    @Inject
    NetworkRequestInterfaces networkRequestInterfaces;

    private signinRequest signInRequest;
    EditText username,password;
    Button signin;
    signinContract.SignInPresenter signInPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        ((App) getApplication()).getComponent().inject(this);

        username = findViewById(R.id.user_name);
        password = findViewById(R.id.pass);
        signin = findViewById(R.id.sigin);
        signInPresenter = new signinPresenter(this);
        signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.sigin)
        {
            signInRequest = new signinRequest(username.getText().toString(),password.getText().toString());
            Call<signinRequest> networkrequest = networkRequestInterfaces.SignIn(signInRequest);
            signInPresenter.getSignInCredentials(networkrequest);
        }
    }

    @Override
    public void showTost(String string) {
        Toast.makeText(this,string,Toast.LENGTH_SHORT).show();
    }

}

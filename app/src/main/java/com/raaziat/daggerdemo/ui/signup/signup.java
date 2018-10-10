package com.raaziat.daggerdemo.ui.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.raaziat.daggerdemo.R;
import com.raaziat.daggerdemo.app.App;
import com.raaziat.daggerdemo.model.signup.signupRequest;
import com.raaziat.daggerdemo.network.NetworkRequestInterfaces;

import javax.inject.Inject;

import retrofit2.Call;

public class signup extends AppCompatActivity implements View.OnClickListener, signupContract.SignUpView {

    @Inject
    NetworkRequestInterfaces networkRequestInterfaces;

    EditText username,password,postal;
    Button signup;
    signupContract.SignUpPresenter signUpPresenter;
    private signupRequest signUpRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ((App) getApplication()).getComponent().inject(this);


        username = findViewById(R.id.user_name);
        password = findViewById(R.id.pass);
        postal = findViewById(R.id.post);
        signup = findViewById(R.id.sigup);
        signUpPresenter = new signupPresenter(this);
        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.sigup)
        {
            signUpRequest= new signupRequest(username.getText().toString(),password.getText().toString(),postal.getText().toString());
            Call<signupRequest> networkrequest = networkRequestInterfaces.SignUp(signUpRequest);
            signUpPresenter.getSignUpCredentials(networkrequest);
    }}

    @Override
    public void showToast(String string) {
        Toast.makeText(this,string,Toast.LENGTH_SHORT).show();
    }
}

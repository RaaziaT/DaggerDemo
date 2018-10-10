package com.raaziat.daggerdemo.app;

import android.app.Application;

import com.raaziat.daggerdemo.login.LoginModule;
import com.raaziat.daggerdemo.constant.Constants;
import com.raaziat.daggerdemo.network.NetModule;

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .netModule(new NetModule(Constants.BASE_URL))
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
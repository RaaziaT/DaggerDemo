package com.raaziat.daggerdemo.app;

import com.raaziat.daggerdemo.login.LoginActivity;
import com.raaziat.daggerdemo.login.LoginModule;
import com.raaziat.daggerdemo.network.NetModule;
import com.raaziat.daggerdemo.ui.signin.signin;
import com.raaziat.daggerdemo.ui.signup.signup;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class, NetModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);
    void inject(signin signin);
    void inject(signup signup);


}

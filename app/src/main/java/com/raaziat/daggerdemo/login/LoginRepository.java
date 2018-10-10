package com.raaziat.daggerdemo.login;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}


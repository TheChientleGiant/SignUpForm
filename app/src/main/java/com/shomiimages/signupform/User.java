package com.shomiimages.signupform;

import java.io.Serializable;

/**
 * Created by Justin Dean Chien on 2/23/2016.
 */
public class User implements Serializable{
    private String mUsername;
    private String mPassword;

    User(String username, String password){
        this.mUsername = username;
        this.mPassword = password;
    }

    public String getUsername(){
        return mUsername;
    }
}

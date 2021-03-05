package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("G0yP1X9TK3AaYKy5BpRKbMtNfiL9x6eSuy4tK1U1")
                .clientKey("znYPJms9hIcf6tt5HaKco9nrQo3qDwl8vKxITV8F")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

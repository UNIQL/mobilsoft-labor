package com.mobilsoftlab.uniql.restaurantapp;

import android.app.Application;

import com.mobilsoftlab.uniql.restaurantapp.repository.Repository;
import com.mobilsoftlab.uniql.restaurantapp.ui.UIModule;

import javax.inject.Inject;

/**
 * Created by UNIQL on 3/23/17.
 */

public class RestaurantAppApplication extends Application {
    @Inject
    Repository repository;

    public static RestaurantAppApplicationComponent injector;


    public void setInjector(RestaurantAppApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
        repository.open(getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerRestaurantAppApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();


        injector.inject(this);
        repository.open(getApplicationContext());
    }
}

package com.mobilsoftlab.uniql.restaurantapp;

import android.app.Application;

import com.mobilsoftlab.uniql.restaurantapp.ui.UIModule;

/**
 * Created by UNIQL on 3/23/17.
 */

public class RestaurantAppApplication extends Application {
    public static RestaurantAppApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector = DaggerRestaurantAppApplicationComponent.builder().
                uIModule(new UIModule(this)).build();
    }
}

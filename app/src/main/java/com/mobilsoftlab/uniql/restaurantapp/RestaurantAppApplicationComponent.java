package com.mobilsoftlab.uniql.restaurantapp;

import com.mobilsoftlab.uniql.restaurantapp.ui.UIModule;
import com.mobilsoftlab.uniql.restaurantapp.ui.favourites.FavouritesActivity;
import com.mobilsoftlab.uniql.restaurantapp.ui.main.MainActivity;
import com.mobilsoftlab.uniql.restaurantapp.ui.restaurantdetail.RestaurantDetailActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by UNIQL on 3/23/17.
 */

@Singleton
@Component(modules = {UIModule.class})
public interface RestaurantAppApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(RestaurantDetailActivity restaurantDetailActivity);
    void inject(FavouritesActivity favouritesActivity);
}

package com.mobilsoftlab.uniql.restaurantapp;

import com.mobilsoftlab.uniql.restaurantapp.interactor.favourite.FavouriteInteractor;
import com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.RestaurantInteractor;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;
import com.mobilsoftlab.uniql.restaurantapp.ui.UIModule;
import com.mobilsoftlab.uniql.restaurantapp.ui.favourites.FavouritesActivity;
import com.mobilsoftlab.uniql.restaurantapp.ui.favourites.FavouritesPresenter;
import com.mobilsoftlab.uniql.restaurantapp.ui.main.MainActivity;
import com.mobilsoftlab.uniql.restaurantapp.ui.main.MainPresenter;
import com.mobilsoftlab.uniql.restaurantapp.ui.restaurantdetail.RestaurantDetailActivity;
import com.mobilsoftlab.uniql.restaurantapp.ui.restaurantdetail.RestaurantDetailPresenter;

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
    void inject(FavouriteInteractor favouritesInteractor);
    void inject(RestaurantInteractor eventInteractor);
    void inject(MainPresenter mainPresenter);
    void inject(FavouritesPresenter favouritesPresenter);
    void inject(RestaurantDetailPresenter eventsPresenter);

}

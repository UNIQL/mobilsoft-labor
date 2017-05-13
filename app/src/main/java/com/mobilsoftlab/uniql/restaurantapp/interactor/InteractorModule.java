package com.mobilsoftlab.uniql.restaurantapp.interactor;

import com.mobilsoftlab.uniql.restaurantapp.interactor.favourite.FavouriteInteractor;
import com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.RestaurantInteractor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by UNIQL on 4/5/17.
 */

@Module
public class InteractorModule {


    @Provides
    public FavouriteInteractor provideFavourites() {
        return new FavouriteInteractor();
    }

    @Provides
    public RestaurantInteractor provideRestaurantInteractor() {
        return new RestaurantInteractor();
    }
}

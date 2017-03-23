package com.mobilsoftlab.uniql.restaurantapp.ui;

import android.content.Context;

import com.mobilsoftlab.uniql.restaurantapp.ui.favourites.FavouritesPresenter;
import com.mobilsoftlab.uniql.restaurantapp.ui.main.MainPresenter;
import com.mobilsoftlab.uniql.restaurantapp.ui.restaurantdetail.RestaurantDetailPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by UNIQL on 3/23/17.
 */

@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public RestaurantDetailPresenter provideRestaurantDetailPresenter() {
        return new RestaurantDetailPresenter();
    }

    @Provides
    @Singleton
    public FavouritesPresenter provideFavouritesPresenter() {
        return new FavouritesPresenter();
    }

}

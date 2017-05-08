package com.mobilsoftlab.uniql.restaurantapp.ui.favourites;

import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.interactor.favourite.FavouriteInteractor;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;
import com.mobilsoftlab.uniql.restaurantapp.ui.Presenter;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by UNIQL on 3/23/17.
 */

public class FavouritesPresenter extends Presenter<FavouritesScreen> {
    @Inject
    EventBus eventBus;
    @Inject
    FavouriteInteractor favouritesInteractor;

    public FavouritesPresenter() {
        RestaurantAppApplication.injector.inject(this);
    }

    @Override
    public void attachScreen(FavouritesScreen screen) {
        super.attachScreen(screen);
        eventBus.register(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
        eventBus.unregister(this);
    }

    public void getFavourites() {
        favouritesInteractor.getFavourites();
    }
}

package com.mobilsoftlab.uniql.restaurantapp.ui.favourites;

import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.interactor.favourite.FavouriteInteractor;
import com.mobilsoftlab.uniql.restaurantapp.interactor.favourite.events.GetFavouritesEvent;
import com.mobilsoftlab.uniql.restaurantapp.ui.Presenter;

import java.util.concurrent.Executor;

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

    @Inject
    Executor executor;

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
        executor.execute(new Runnable() {
            @Override
            public void run() {
                favouritesInteractor.getFavourites();
            }
        });
    }

    public void onEventMainThread(GetFavouritesEvent event) {
        if (screen != null) {
            if (event.getThrowable() != null) {
                screen.showError();
            } else {
                screen.showFavouriteRestaurants(event.getRestaurants());
            }
        }
    }
}

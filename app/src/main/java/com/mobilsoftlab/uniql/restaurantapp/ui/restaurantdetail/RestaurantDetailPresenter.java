package com.mobilsoftlab.uniql.restaurantapp.ui.restaurantdetail;

import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;
import com.mobilsoftlab.uniql.restaurantapp.ui.Presenter;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by UNIQL on 3/23/17.
 */

public class RestaurantDetailPresenter extends Presenter<RestaurantDetailScreen> {

    @Inject
    EventBus eventBus;

    public RestaurantDetailPresenter() {
        RestaurantAppApplication.injector.inject(this);
    }

    @Override
    public void attachScreen(RestaurantDetailScreen screen) {
        super.attachScreen(screen);
        eventBus.register(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
        eventBus.unregister(this);
    }

    public void addFavourite(Restaurant restaurant) {
        //TODO
    }
}

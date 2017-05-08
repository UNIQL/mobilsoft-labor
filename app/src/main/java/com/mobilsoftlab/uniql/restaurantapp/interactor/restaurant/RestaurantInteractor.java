package com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant;

import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by UNIQL on 4/5/17.
 */

public class RestaurantInteractor {

    @Inject
    EventBus eventBus;

    public RestaurantInteractor() {
        RestaurantAppApplication.injector.inject(this);
    }

    public void getRestaurants() {

    }

    public void getRestaurant(String id) {

    }

}

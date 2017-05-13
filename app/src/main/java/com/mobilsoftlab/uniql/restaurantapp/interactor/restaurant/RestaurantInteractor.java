package com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant;

import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.events.GetRestaurantEvent;
import com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.events.GetRestaurantsEvent;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;
import com.mobilsoftlab.uniql.restaurantapp.network.restaurant.RestaurantApi;

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by UNIQL on 4/5/17.
 */

public class RestaurantInteractor {

    @Inject
    EventBus eventBus;

    @Inject
    RestaurantApi restaurantApi;

    public RestaurantInteractor() {
        RestaurantAppApplication.injector.inject(this);
    }

    public void getRestaurants() {
        GetRestaurantsEvent event = new GetRestaurantsEvent();
        try {
            List<Restaurant> restaurants = restaurantApi.restaurantsGet().execute().body();
            event.setRestaurants(restaurants);
            eventBus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }

    public void getRestaurant(String id) {
        GetRestaurantEvent event = new GetRestaurantEvent();
        try {
            Restaurant restaurant = restaurantApi.restaurantsIdGet(id).execute().body();
            event.setRestaurant(restaurant);
            eventBus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }

}

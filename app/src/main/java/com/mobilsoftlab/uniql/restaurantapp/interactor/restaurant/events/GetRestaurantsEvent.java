package com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.events;

import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

import java.util.List;

/**
 * Created by UNIQL on 4/5/17.
 */

public class GetRestaurantsEvent {
    private int code;
    private List<Restaurant> restaurants;
    private Throwable throwable;

    public GetRestaurantsEvent() {
    }

    public GetRestaurantsEvent(int code, List<Restaurant> restaurants, Throwable throwable) {
        this.code = code;
        this.restaurants = restaurants;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}

package com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.events;

import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

import java.util.List;

/**
 * Created by UNIQL on 4/5/17.
 */

public class GetRestaurantEvent {
    private int code;
    private Restaurant restaurant;
    private Throwable throwable;

    public GetRestaurantEvent() {
    }

    public GetRestaurantEvent(int code, Restaurant restaurant, Throwable throwable) {
        this.code = code;
        this.restaurant = restaurant;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}

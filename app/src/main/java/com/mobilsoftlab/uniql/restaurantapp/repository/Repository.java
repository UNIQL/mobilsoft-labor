package com.mobilsoftlab.uniql.restaurantapp.repository;

import android.content.Context;

import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

import java.util.List;

/**
 * Created by UNIQL on 4/5/17.
 */

public interface Repository {
    void open(Context context);
    void close();

    List<Restaurant> getFavourites();
    void addFavourite(Restaurant event);
    void removeFavourite(Restaurant event);
}
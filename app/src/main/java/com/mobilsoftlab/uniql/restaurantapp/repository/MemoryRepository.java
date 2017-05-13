package com.mobilsoftlab.uniql.restaurantapp.repository;

import android.content.Context;

import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UNIQL on 4/5/17.
 */

public class MemoryRepository implements Repository {

    private static List<Restaurant> favourites;

    @Override
    public void open(Context context) {
        favourites = new ArrayList<>();
    }

    @Override
    public void close() {
        favourites = null;
    }

    @Override
    public List<Restaurant> getFavourites() {
        return favourites;
    }

    @Override
    public void addFavourite(Restaurant event) {
        favourites.add(event);
    }

    @Override
    public void removeFavourite(Restaurant event) {
        favourites.remove(event);
    }
}

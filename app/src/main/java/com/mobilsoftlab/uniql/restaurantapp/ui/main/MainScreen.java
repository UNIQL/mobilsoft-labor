package com.mobilsoftlab.uniql.restaurantapp.ui.main;

import com.mobilsoftlab.uniql.restaurantapp.model.NetworkError;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

import java.util.List;

/**
 * Created by UNIQL on 3/23/17.
 */

public interface MainScreen {
    void showRestaurants(List<Restaurant> restaurants);
    void showNetworkError(NetworkError networkError);
}

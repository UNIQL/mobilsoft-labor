package com.mobilsoftlab.uniql.restaurantapp.ui.restaurantdetail;

import com.mobilsoftlab.uniql.restaurantapp.model.NetworkError;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

/**
 * Created by UNIQL on 3/23/17.
 */

public interface RestaurantDetailScreen {
    void showRestaurant(Restaurant restaurant);
    void showNetworkError(NetworkError networkError);
}

package com.mobilsoftlab.uniql.restaurantapp.ui.restaurantdetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mobilsoftlab.uniql.restaurantapp.R;
import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.model.NetworkError;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

import javax.inject.Inject;

public class RestaurantDetailActivity extends AppCompatActivity implements RestaurantDetailScreen {

    @Inject
    RestaurantDetailPresenter restaurantDetailPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);
        RestaurantAppApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        restaurantDetailPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        restaurantDetailPresenter.detachScreen();
    }

    @Override
    public void showRestaurant(Restaurant restaurant) {

    }

    @Override
    public void showNetworkError(NetworkError networkError) {

    }
}

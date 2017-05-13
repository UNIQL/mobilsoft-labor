package com.mobilsoftlab.uniql.restaurantapp.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mobilsoftlab.uniql.restaurantapp.R;
import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.model.NetworkError;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainScreen {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RestaurantAppApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainPresenter.detachScreen();
    }

    @Override
    public void showRestaurants(List<Restaurant> restaurants) {

    }

    @Override
    public void showNetworkError(NetworkError networkError) {

    }
}

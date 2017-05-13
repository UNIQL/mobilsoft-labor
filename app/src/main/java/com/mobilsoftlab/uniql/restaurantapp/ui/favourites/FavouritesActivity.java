package com.mobilsoftlab.uniql.restaurantapp.ui.favourites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mobilsoftlab.uniql.restaurantapp.R;
import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;

import java.util.List;

import javax.inject.Inject;

public class FavouritesActivity extends AppCompatActivity implements FavouritesScreen {

    @Inject
    FavouritesPresenter favouritesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        RestaurantAppApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        favouritesPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        favouritesPresenter.detachScreen();
    }

    @Override
    public void showFavouriteRestaurants(List<Restaurant> restaurants) {

    }

    @Override
    public void showError() {

    }
}

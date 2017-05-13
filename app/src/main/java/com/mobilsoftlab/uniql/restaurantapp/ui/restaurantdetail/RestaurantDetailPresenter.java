package com.mobilsoftlab.uniql.restaurantapp.ui.restaurantdetail;

import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.interactor.favourite.FavouriteInteractor;
import com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.RestaurantInteractor;
import com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.events.GetRestaurantEvent;
import com.mobilsoftlab.uniql.restaurantapp.model.NetworkError;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;
import com.mobilsoftlab.uniql.restaurantapp.ui.Presenter;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by UNIQL on 3/23/17.
 */

public class RestaurantDetailPresenter extends Presenter<RestaurantDetailScreen> {

    @Inject
    EventBus eventBus;

    @Inject
    Executor executor;

    @Inject
    RestaurantInteractor restaurantInteractor;

    @Inject
    FavouriteInteractor favouritesInteractor;

    private String selectedRestaurantId;
    private Restaurant selectedRestaurant;

    public RestaurantDetailPresenter() {
        RestaurantAppApplication.injector.inject(this);
    }

    @Override
    public void attachScreen(RestaurantDetailScreen screen) {
        super.attachScreen(screen);
        eventBus.register(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
        eventBus.unregister(this);
    }

    public String getSelectedRestaurantId() {
        return selectedRestaurantId;
    }

    public void setSelectedRestaurantId(String selectedRestaurantId) {
        this.selectedRestaurantId = selectedRestaurantId;
    }

    public void getRestaurant() {
        if (selectedRestaurantId != null) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    restaurantInteractor.getRestaurant(selectedRestaurantId);
                }
            });
        }
    }

    public void onEventMainThread(GetRestaurantEvent event) {
        if (screen != null) {
            if (event.getThrowable() != null) {
                screen.showNetworkError(new NetworkError(event.getCode(), event.getThrowable().getMessage()));
            } else {
                selectedRestaurant = event.getRestaurant();
                screen.showRestaurant(selectedRestaurant);
            }
        }
    }

    public void addFavourite(Restaurant restaurant) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                favouritesInteractor.addFavourite(selectedRestaurant);
            }
        });
    }
}

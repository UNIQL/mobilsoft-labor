package com.mobilsoftlab.uniql.restaurantapp.ui.main;

import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.RestaurantInteractor;
import com.mobilsoftlab.uniql.restaurantapp.interactor.restaurant.events.GetRestaurantsEvent;
import com.mobilsoftlab.uniql.restaurantapp.model.NetworkError;
import com.mobilsoftlab.uniql.restaurantapp.ui.Presenter;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by UNIQL on 3/23/17.
 */

public class MainPresenter extends Presenter<MainScreen> {
    @Inject
    Executor executor;

    @Inject
    EventBus eventBus;

    @Inject
    RestaurantInteractor restaurantInteractor;

    public MainPresenter() {
        RestaurantAppApplication.injector.inject(this);
    }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
        eventBus.register(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
        eventBus.unregister(this);
    }

    public void getRestaurants() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                restaurantInteractor.getRestaurants();
            }
        });
    }

    public void onEventMainThread(GetRestaurantsEvent event) {
        if (screen != null) {
            if (event.getThrowable() != null) {
                screen.showNetworkError(new NetworkError(event.getCode(), event.getThrowable().getMessage()));
            } else {
                screen.showRestaurants(event.getRestaurants());
            }
        }
    }
}

package com.mobilsoftlab.uniql.restaurantapp.interactor.favourite;

import com.mobilsoftlab.uniql.restaurantapp.RestaurantAppApplication;
import com.mobilsoftlab.uniql.restaurantapp.interactor.favourite.events.AddFavouriteEvent;
import com.mobilsoftlab.uniql.restaurantapp.interactor.favourite.events.GetFavouritesEvent;
import com.mobilsoftlab.uniql.restaurantapp.interactor.favourite.events.RemoveFavouriteEvent;
import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;
import com.mobilsoftlab.uniql.restaurantapp.repository.Repository;

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by UNIQL on 4/5/17.
 */

public class FavouriteInteractor {

    @Inject
    Repository repository;

    @Inject
    EventBus eventBus;

    public FavouriteInteractor() {
        RestaurantAppApplication.injector.inject(this);
    }

    public void getFavourites() {
        GetFavouritesEvent event = new GetFavouritesEvent();
        try {
            List<Restaurant> restaurants = repository.getFavourites();
            event.setRestaurants(restaurants);
            eventBus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }

    public void addFavourite(Restaurant restaurant) {
        AddFavouriteEvent addFavouriteEvent = new AddFavouriteEvent();
        addFavouriteEvent.setRestaurant(restaurant);
        try {
            repository.addFavourite(restaurant);
            eventBus.post(addFavouriteEvent);
        } catch (Exception e) {
            addFavouriteEvent.setThrowable(e);
            eventBus.post(restaurant);
        }
    }

    public void removeFavourites(Restaurant restaurant) {
        RemoveFavouriteEvent removeFavouriteEvent = new RemoveFavouriteEvent();
        removeFavouriteEvent.setRestaurant(restaurant);
        try {
            repository.removeFavourite(restaurant);
            eventBus.post(removeFavouriteEvent);
        } catch (Exception e) {
            removeFavouriteEvent.setThrowable(e);
            eventBus.post(removeFavouriteEvent);
        }
    }
}

package com.mobilsoftlab.uniql.restaurantapp.network.restaurant;

import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RestaurantApi {
  
  /**
   * Restaurants
   * The Restaurant endpoint returns with an array of Restaurant.
   * @return Call<List<Restaurant>>
   */
  
  @GET("restaurants")
  Call<List<Restaurant>> restaurantsGet();
    

  
  /**
   * Restaurant
   * The Restaurant endpoint returns with a Restaurant with the given id.
   * @param id The id of a restaurant
   * @return Call<Restaurant>
   */
  
  @GET("restaurants/{id}")
  Call<Restaurant> restaurantsIdGet(
    @Path("id") String id
  );

  
}

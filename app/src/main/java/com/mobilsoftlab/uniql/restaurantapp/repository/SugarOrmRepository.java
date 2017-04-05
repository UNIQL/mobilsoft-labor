package com.mobilsoftlab.uniql.restaurantapp.repository;

import android.content.Context;

import com.mobilsoftlab.uniql.restaurantapp.model.Restaurant;
import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by UNIQL on 4/5/17.
 */

public class SugarOrmRepository implements Repository {
    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public List<Restaurant> getFavourites() {
        return SugarRecord.listAll(Restaurant.class);
    }

    @Override
    public void addFavourite(Restaurant event) {
        SugarRecord.save(event);
    }

    @Override
    public void removeFavourite(Restaurant event) {
        SugarRecord.delete(event);
    }
}

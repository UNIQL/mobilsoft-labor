package com.mobilsoftlab.uniql.restaurantapp;

import android.content.Context;

import com.mobilsoftlab.uniql.restaurantapp.ui.UIModule;
import com.mobilsoftlab.uniql.restaurantapp.ui.favourites.FavouritesPresenter;
import com.mobilsoftlab.uniql.restaurantapp.ui.main.MainPresenter;
import com.mobilsoftlab.uniql.restaurantapp.ui.restaurantdetail.RestaurantDetailPresenter;
import com.mobilsoftlab.uniql.restaurantapp.utils.UiExecutor;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.EventBus;

@Module
public class TestModule {

    private final UIModule UIModule;

    public TestModule(Context context) {
        this.UIModule = new UIModule(context);
    }

    @Provides
    public Context provideContext() {
        return UIModule.provideContext();
    }


    @Provides
    public MainPresenter provideMainPresenter() {
        return UIModule.provideMainPresenter();
    }

    @Provides
    public RestaurantDetailPresenter provideRestaurantDetailPresenter() {
        return UIModule.provideRestaurantDetailPresenter();
    }

    @Provides
    public FavouritesPresenter provideFavouritesPresenter() {
        return UIModule.provideFavouritesPresenter();
    }

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return EventBus.getDefault();
    }

    @Provides
    @Singleton
    public Executor provideNetworkExecutor() {
        return new UiExecutor();
    }
}

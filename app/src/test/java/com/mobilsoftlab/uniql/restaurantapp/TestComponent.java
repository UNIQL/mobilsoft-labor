package com.mobilsoftlab.uniql.restaurantapp;

import com.mobilsoftlab.uniql.restaurantapp.interactor.InteractorModule;
import com.mobilsoftlab.uniql.restaurantapp.mock.MockNetworkModule;
import com.mobilsoftlab.uniql.restaurantapp.repository.TestRepositoryModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class, InteractorModule.class, TestRepositoryModule.class})
public interface TestComponent extends RestaurantAppApplicationComponent {
}

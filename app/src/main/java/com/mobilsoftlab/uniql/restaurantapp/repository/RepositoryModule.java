package com.mobilsoftlab.uniql.restaurantapp.repository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by UNIQL on 4/5/17.
 */

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    public Repository provideRepository() {
        return new SugarOrmRepository();
    }
}

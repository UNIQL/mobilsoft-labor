package com.mobilsoftlab.uniql.restaurantapp.ui;

/**
 * Created by UNIQL on 3/23/17.
 */

public abstract class Presenter<S> {
    protected S screen;

    public void attachScreen(S screen) {
        this.screen = screen;
    }

    public void detachScreen() {
        this.screen = null;
    }
}

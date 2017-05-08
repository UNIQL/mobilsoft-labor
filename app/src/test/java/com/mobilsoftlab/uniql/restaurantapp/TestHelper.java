package com.mobilsoftlab.uniql.restaurantapp;

import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;

public class TestHelper {

    public static void setTestInjector() {
        ShadowLog.stream = System.out;
        RestaurantAppApplication application = (RestaurantAppApplication) RuntimeEnvironment.application;
        RestaurantAppApplicationComponent injector = DaggerTestComponent.builder().testModule(new TestModule(application.getApplicationContext())).build();
        application.setInjector(injector);
    }
}

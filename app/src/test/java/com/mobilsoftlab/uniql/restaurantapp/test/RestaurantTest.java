package com.mobilsoftlab.uniql.restaurantapp.test;

import com.mobilsoftlab.uniql.restaurantapp.BuildConfig;
import com.mobilsoftlab.uniql.restaurantapp.ui.main.MainPresenter;
import com.mobilsoftlab.uniql.restaurantapp.utils.RobolectricDaggerTestRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import static com.mobilsoftlab.uniql.restaurantapp.TestHelper.setTestInjector;

@RunWith(RobolectricDaggerTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class RestaurantTest {

    private MainPresenter mianPresenter;

    @Before
    public void setup() throws Exception {
        setTestInjector();
        mianPresenter = new MainPresenter();
    }

    /*@Test
    public void testTodo() {
        MainScreen mainScreen = mock(MainScreen.class);
        mianPresenter.attachScreen(mainScreen);
        mianPresenter.getFavourites();

        ArgumentCaptor<String> todosCaptor = ArgumentCaptor.forClass(String.class);
        verify(mainScreen, times(2)).showMessage(todosCaptor.capture());

        List<String> capturedTodos = todosCaptor.getAllValues();
        assertEquals("todo one", capturedTodos.get(0));
        assertEquals("todo two", capturedTodos.get(1));
    }*/

    @After
    public void tearDown() {
        mianPresenter.detachScreen();
    }
}

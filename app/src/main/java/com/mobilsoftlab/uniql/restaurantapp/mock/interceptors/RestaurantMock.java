package com.mobilsoftlab.uniql.restaurantapp.mock.interceptors;

import android.net.Uri;

import com.mobilsoftlab.uniql.restaurantapp.network.NetworkConfig;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

import static com.mobilsoftlab.uniql.restaurantapp.mock.interceptors.MockHelper.makeResponse;

public class RestaurantMock {
    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString;
        int responseCode;
        Headers headers = request.headers();


        if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "restaurants") && request.method().equals("GET")) {
            responseString = "";
            responseCode = 200;

            /**
             * Simple Get Example
             */
			/*
		}else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "Todos") && request.method().equals("Get")) {
			MemoryRepository memoryRepository = new MemoryRepository();
			memoryRepository.open(null);
			responseString = GsonHelper.getGson().toJson(memoryRepository.getFavourites());
			responseCode = 200;*/
        } else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "restaurants/") && request.method().equals("GET")) {
            responseString = "";
            responseCode = 200;
        } else {
            responseString = "ERROR";
            responseCode = 503;
        }

        return makeResponse(request, headers, responseCode, responseString);
    }
}

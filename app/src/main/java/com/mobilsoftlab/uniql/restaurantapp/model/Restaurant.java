package com.mobilsoftlab.uniql.restaurantapp.model;

/**
 * Created by UNIQL on 3/23/17.
 */


import java.util.Objects;
import com.google.gson.annotations.SerializedName;


public class Restaurant   {

    @SerializedName("restaurantId")
    private String restaurantId = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("imageUrl")
    private String imageUrl = null;

    @SerializedName("address")
    private String address = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("rating")
    private Integer rating = null;



    /**
     * Unique identifier of a restaurant.
     **/
    public String getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }


    /**
     * Display name of restaurant.
     **/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Description of restaurant.
     **/
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Image URL representing the restaurant.
     **/
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * Address of restaurant
     **/
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Type of restaurant.
     **/
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Rating of restaurant.
     **/
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Restaurant restaurant = (Restaurant) o;
        return Objects.equals(restaurantId, restaurant.restaurantId) &&
                Objects.equals(name, restaurant.name) &&
                Objects.equals(description, restaurant.description) &&
                Objects.equals(imageUrl, restaurant.imageUrl) &&
                Objects.equals(address, restaurant.address) &&
                Objects.equals(type, restaurant.type) &&
                Objects.equals(rating, restaurant.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restaurantId, name, description, imageUrl, address, type, rating);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Restaurant {\n");

        sb.append("    restaurantId: ").append(toIndentedString(restaurantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


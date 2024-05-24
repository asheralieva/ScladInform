package com.example.scladinform.remote_data;


import com.example.scladinform.models.Order;
import com.example.scladinform.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("api/v1/user/all")
    Call<List<User>> getAllUsers();
    @GET("api/v1/order/all")
    Call<List<Order>> getAllOrders();
}

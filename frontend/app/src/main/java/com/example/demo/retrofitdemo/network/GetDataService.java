package com.example.demo.retrofitdemo.network;

import com.example.demo.retrofitdemo.model.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Codemaker on 12/06/2021.
 */

public interface GetDataService {

    @GET("/book")
    Call<List<Book>> getBooks();
}

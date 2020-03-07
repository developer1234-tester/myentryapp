package com.taurus.myentriapp.service.repository.network.api;

import com.taurus.myentriapp.service.repository.storage.model.Movie;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.taurus.myentriapp.Constants.API_KEY_REQUEST_PARAM;
import static com.taurus.myentriapp.Constants.LANGUAGE_REQUEST_PARAM;
import static com.taurus.myentriapp.Constants.PAGE_REQUEST_PARAM;


public interface MoviesAPIInterface {

    @GET(".")
    Call<ArrayList<Movie>> getMovies(@Query(API_KEY_REQUEST_PARAM) String apiKey,
                                     @Query(LANGUAGE_REQUEST_PARAM) String language,
                                     @Query(PAGE_REQUEST_PARAM) int page);
}

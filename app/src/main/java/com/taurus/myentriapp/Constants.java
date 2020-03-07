package com.taurus.myentriapp;



import com.taurus.myentriapp.service.repository.storage.model.Movie;


import java.lang.reflect.Type;
import java.util.ArrayList;

public class Constants {
    // network
    public static final String MOVIES_ARRAY_DATA_TAG = "results";
    public static final Type MOVIE_ARRAY_LIST_CLASS_TYPE = (new ArrayList<Movie>()).getClass();
    public static final String MOVIES_BASE_URL = "https://api.themoviedb.org/3/movie/now_playing/";
    private static final String IMAGE_URL_PREFIX = "https://image.tmdb.org/t/p/";
    public static final String SMALL_IMAGE_URL_PREFIX = IMAGE_URL_PREFIX + "w300";
    public static final String BIG_IMAGE_URL_PREFIX = IMAGE_URL_PREFIX + "w500";
    public static final String API_KEY_REQUEST_PARAM = "api_key";
    public static final String LANGUAGE_REQUEST_PARAM = "language";
    public static final String PAGE_REQUEST_PARAM = "page";
    public static final String API_KEY = "56c861fd95f0d987f2f7cc25e3ca54d6";
    public static final String LANGUAGE = "en-US";
    public static final int LOADING_PAGE_SIZE = 20;
    // DB
    public static final String DATA_BASE_NAME = "Moviedb.db";
    public static final int NUMBERS_OF_THREADS = 3;
}

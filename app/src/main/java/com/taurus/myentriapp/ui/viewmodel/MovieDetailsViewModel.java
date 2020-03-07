package com.taurus.myentriapp.ui.viewmodel;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.taurus.myentriapp.service.repository.storage.model.Movie;

public class MovieDetailsViewModel extends ViewModel {
    final private MutableLiveData movie;

    public MovieDetailsViewModel() {
        movie = new MutableLiveData<Movie>();
    }

    public MutableLiveData<Movie> getMovie() {
        return movie;
    }
}

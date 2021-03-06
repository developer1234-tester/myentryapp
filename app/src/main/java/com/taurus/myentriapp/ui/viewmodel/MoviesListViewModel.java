package com.taurus.myentriapp.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.paging.PagedList;

import com.taurus.myentriapp.MoviesRepository;
import com.taurus.myentriapp.service.repository.storage.model.Movie;
import com.taurus.myentriapp.service.repository.storage.model.NetworkState;


public class MoviesListViewModel extends AndroidViewModel {
    private MoviesRepository repository;

    public MoviesListViewModel(@NonNull Application application) {
        super(application);
        repository = MoviesRepository.getInstance(application);
    }
    public LiveData<PagedList<Movie>> getMovies() {
        return repository.getMovies();
    }

    public LiveData<NetworkState> getNetworkState() {
        return repository.getNetworkState();
    }

}

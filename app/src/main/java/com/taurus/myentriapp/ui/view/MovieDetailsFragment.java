package com.taurus.myentriapp.ui.view;


import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.squareup.picasso.Picasso;
import com.taurus.myentriapp.R;
import com.taurus.myentriapp.databinding.FragmentDetailsBinding;
import com.taurus.myentriapp.ui.viewmodel.MovieDetailsViewModel;

import static com.taurus.myentriapp.Constants.BIG_IMAGE_URL_PREFIX;


public class MovieDetailsFragment extends Fragment {

    private MovieDetailsViewModel viewModel;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate view and obtain an instance of the binding class.
        FragmentDetailsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false);
        viewModel = ViewModelProviders.of(getActivity()).get(MovieDetailsViewModel.class);
        View view = binding.getRoot();
        viewModel.getMovie().observe(this, binding::setMovie);
        return view;
    }

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        if(url != null) {
            Picasso.get().load(BIG_IMAGE_URL_PREFIX+url).into(view);
        }
    }
}

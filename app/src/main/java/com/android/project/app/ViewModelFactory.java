package com.android.project.app;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import dagger.Lazy;

public class ViewModelFactory<VM extends ViewModel> implements ViewModelProvider.Factory {

    private Lazy<VM> mLazyViewModel;

    @Inject
    public ViewModelFactory(Lazy<VM> lazyViewModel) {
        this.mLazyViewModel = lazyViewModel;
    }

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) mLazyViewModel.get();
    }
}

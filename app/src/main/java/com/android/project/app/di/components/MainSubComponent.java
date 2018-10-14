package com.android.project.app.di.components;

import com.android.project.app.di.annotations.Scopes;
import com.android.project.app.ui.MainActivity;
import com.android.project.app.di.modules.MainModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Scopes.PerActivity
@Subcomponent(modules = {
        MainModule.class,
})
public interface MainSubComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }
}

package com.android.project.app.di.modules;

import android.app.Activity;

import com.android.project.app.ui.MainActivity;
import com.android.project.app.di.components.MainSubComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class BuildersModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainSubComponent.Builder builder);
}

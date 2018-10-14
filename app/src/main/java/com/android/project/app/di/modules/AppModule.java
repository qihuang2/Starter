package com.android.project.app.di.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.android.project.app.di.components.MainSubComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {MainSubComponent.class})
public class AppModule {

    @Provides
    public Context providesAppContext(Application application){
        return application.getApplicationContext();
    }

    @Singleton
    @Provides
    public SharedPreferences providesSharedPreference(Context appContext){
        return PreferenceManager.getDefaultSharedPreferences(appContext);
    }
}

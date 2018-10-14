package com.android.project.app.constants;

import com.android.project.app.di.annotations.Qualifiers;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule {

    private static final String BASE_URL = "FILL IN";
    private static final String VERSION = "FILL IN";
    private static final String URL = String.format("%s/%s/",BASE_URL, VERSION);

    @Singleton
    @Provides
    @Qualifiers.URL
    public String url() {
        return URL;
    }
}

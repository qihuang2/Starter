package com.android.project.app.di.modules;

import com.android.project.app.di.annotations.Qualifiers;
import com.android.project.app.di.components.MainSubComponent;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter;

import java.util.Date;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Module(subcomponents = {MainSubComponent.class})
public class NetModule {

    @Singleton
    @Provides
    public static Moshi providesMoshi(){
        return new Moshi.Builder()
                .add(Date.class, new Rfc3339DateJsonAdapter())
                .build();
    }

    @Singleton
    @Provides
    public Retrofit providesRetrofit(Moshi moshi, @Qualifiers.URL String url){
        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

}

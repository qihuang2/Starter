package com.android.project.app.di.components;

import android.app.Application;

import com.android.project.app.MainApplication;
import com.android.project.app.constants.ApiModule;
import com.android.project.app.di.modules.AppModule;
import com.android.project.app.di.modules.BuildersModule;
import com.android.project.app.di.modules.NetModule;
import com.android.project.app.di.modules.RepositoryModule;


import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        BuildersModule.class,
        AppModule.class,
        NetModule.class,
        ApiModule.class,
        RepositoryModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(MainApplication application);

}

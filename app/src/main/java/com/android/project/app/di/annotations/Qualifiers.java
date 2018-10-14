package com.android.project.app.di.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

public final class Qualifiers {

    /**
     * Binds application base URL.
     */
    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface URL {
    }
}

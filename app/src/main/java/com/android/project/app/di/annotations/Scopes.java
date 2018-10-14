package com.android.project.app.di.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

public final class Scopes {

    /**
     * Scope for Activity.
     */
    @Scope
    @Retention(RetentionPolicy.RUNTIME)
    public @interface PerActivity {
    }

    /**
     * Scope for Fragment.
     */
    @Scope
    @Retention(RetentionPolicy.RUNTIME)
    public @interface PerFragment {
    }
}

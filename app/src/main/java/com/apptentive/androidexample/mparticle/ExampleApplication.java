package com.apptentive.androidexample.mparticle;

import android.app.Application;

import com.mparticle.MParticle;
import com.mparticle.MParticleOptions;

public class ExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MParticleOptions options = MParticleOptions.builder(this)
                .credentials("YOUR_MPARTICLE_API_KEY","YOUR_MPARTICLE_API_SECRET")
                .logLevel(MParticle.LogLevel.VERBOSE)
                .build();
        MParticle.start(options);
    }
}

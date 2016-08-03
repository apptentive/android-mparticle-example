package com.apptentive.androidexample;

import android.app.Application;

import com.mparticle.MParticle;


public class ExampleApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		MParticle.start(this, MParticle.InstallType.AutoDetect, MParticle.Environment.Development, "YOUR_MPARTICLE_API_KEY", "YOUR_MPARTICLE_API_SECRET");
	}
}

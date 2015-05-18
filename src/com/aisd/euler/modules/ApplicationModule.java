package com.aisd.euler.modules;

import javax.inject.Singleton;

import com.aisd.euler.App;
import com.aisd.euler.interfaces.Application;
import com.aisd.euler.interfaces.Logger;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
	
	@Provides
	@Singleton
	Application provideApplication(Logger logger) {
		return new App(logger);
	}
}

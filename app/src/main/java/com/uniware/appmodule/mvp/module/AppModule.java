package com.uniware.appmodule.mvp.module;

import android.content.Context;
import com.uniware.appmodule.app.AppApplication;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by ayue on 2017/5/3.
 */
@Module
public class AppModule {

  private  AppApplication application;

  public AppModule(AppApplication application) {
    this.application = application;
  }
  @Provides @Singleton Context provideContext(){
    return application;
  }
}

package com.uniware.appmodule.app;

import com.uniware.appmodule.mvp.component.AppComponent;
import com.uniware.appmodule.mvp.component.DaggerAppComponent;
import com.uniware.appmodule.mvp.module.AppModule;
import com.uniware.mylibrary.base.BaseApplication;

/**
 * Created by ayue on 2017/4/27.
 */

public class AppApplication  extends BaseApplication{

  private static AppComponent appComponent;
  private static AppApplication application;

  @Override public void onCreate() {
    super.onCreate();
    application=this;
    this.appComponent= DaggerAppComponent.builder().appModule(new AppModule(this)).build();
  }
  public static  AppComponent getAppComponent(){
    return appComponent;
  }
}

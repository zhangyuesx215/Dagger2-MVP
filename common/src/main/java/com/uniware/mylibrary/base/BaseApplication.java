package com.uniware.mylibrary.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by ayue on 2017/4/27.
 */

public class BaseApplication extends Application {

  private static BaseApplication appContext;

  public static Context getAppContext(){
    return appContext;
  }

  @Override public void onCreate() {
    super.onCreate();
    appContext=this;
  }
}

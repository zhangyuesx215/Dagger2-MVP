package com.uniware.appmodule.mvp.component;

import android.content.Context;
import com.uniware.appmodule.mvp.module.AppModule;
import com.uniware.mylibrary.base.BaseActivity;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by ayue on 2017/5/3.
 */
@Singleton
@Component (modules = AppModule.class)
public interface AppComponent {

  void inject(BaseActivity baseActivity);
  Context context();
}

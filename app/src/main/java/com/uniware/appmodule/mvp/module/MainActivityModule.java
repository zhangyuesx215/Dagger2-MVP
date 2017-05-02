package com.uniware.appmodule.mvp.module;

import com.uniware.appmodule.bean.RestApiStore;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ayue on 2017/4/27.
 */
@Module
public class MainActivityModule {

  @Provides
  RestApiStore provideApiStore(){
    return new RestApiStore();
  }
}

package com.uniware.appmodule.mvp.component;

import com.uniware.appmodule.mvp.inject.PreActivity;
import com.uniware.appmodule.mvp.module.MainActivityModule;
import com.uniware.appmodule.ui.MainActivity;
import dagger.Component;

/**
 * Created by ayue on 2017/4/27.
 */
@PreActivity
@Component(dependencies = AppComponent.class ,modules = MainActivityModule.class)
public interface MainActivityComponent {
  void inject(MainActivity mainActivity);
}

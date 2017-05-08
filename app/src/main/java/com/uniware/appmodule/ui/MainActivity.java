package com.uniware.appmodule.ui;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.uniware.appmodule.R;
import com.uniware.appmodule.app.AppApplication;
import com.uniware.appmodule.bean.RestApiStore;
import com.uniware.appmodule.bean.Student;
import com.uniware.appmodule.bean.Teacher;
import com.uniware.appmodule.mvp.component.DaggerMainActivityComponent;
import com.uniware.appmodule.mvp.component.MainActivityComponent;
import com.uniware.appmodule.mvp.inject.A;
import com.uniware.appmodule.mvp.inject.B;
import com.uniware.appmodule.mvp.module.MainActivityModule;
import com.uniware.appmodule.mvp.presenter.MainPresenter;
import com.uniware.appmodule.mvp.view.LoginView;
import com.uniware.appmodule.utils.SharedPeferenceUtils;
import com.uniware.mylibrary.base.BaseActivity;
import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends BaseActivity implements LoginView {

  @Bind(R.id.tv) TextView tv;
  @Bind(R.id.splash) RelativeLayout splash;
  private MainActivityComponent component;
  //@Bind(R.id.iRecyclerView) IRecyclerView recyclerView;
  @Inject RestApiStore apiStore;
  @Inject MainPresenter mainPresenter;
  @Inject SharedPeferenceUtils peferenceUtils;
  @A
  @Inject
  Student a;
  @B
  @Inject
  Student b;
  @Named("A")
  @Inject
  Teacher ta;
  @Named("B")
  @Inject
  Teacher tb;
  @Override public void initView() {

  }



  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    //DaggerMainActivityComponent.builder().build().inject(this);
    initializeInjector();
    ButterKnife.bind(this);
    mainPresenter.setLoginView(this);
    mainPresenter.showS();
  }

  @Override public void Succsee() {
    Toast.makeText(this, apiStore.s, Toast.LENGTH_SHORT).show();
    tv.setText("hhhhhhh");
  }

  @Override public void Error(int e) {

  }

  @Override public void initializeInjector() {
    component = DaggerMainActivityComponent.builder()
        .appComponent(AppApplication.getAppComponent())
        .mainActivityModule(new MainActivityModule())
        .build();
    component.inject(this);
  }
}

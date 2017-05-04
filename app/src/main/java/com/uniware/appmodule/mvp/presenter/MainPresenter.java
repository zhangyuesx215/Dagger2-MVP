package com.uniware.appmodule.mvp.presenter;

import com.uniware.appmodule.mvp.view.LoginView;
import com.uniware.mylibrary.base.BasePresenter;
import javax.inject.Inject;

/**
 * Created by ayue on 2017/4/26.
 */

public class MainPresenter extends BasePresenter {

  private LoginView loginView;
  @Inject
  public MainPresenter(){

  }
  public void setLoginView(LoginView loginView){
    this.loginView=loginView;
  }
  public void showS(){
    loginView.Succsee();
  }
  public void Login(){
     loginView.Succsee();
  }
}

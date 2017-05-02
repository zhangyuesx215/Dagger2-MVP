package com.uniware.appmodule.bean;

import javax.inject.Inject;

/**
 * Created by ayue on 2017/4/27.
 */

public class RestApiStore {
  public String s;

  @Inject
  public RestApiStore (){
    s = "12";
  }
}

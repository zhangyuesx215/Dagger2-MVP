package com.uniware.appmodule.ui;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.uniware.appmodule.R;
import com.uniware.appmodule.bean.RestApiStore;
import com.uniware.appmodule.mvp.component.DaggerMainActivityComponent;
import com.uniware.appmodule.mvp.component.MainActivityComponent;
import com.uniware.mylibrary.base.BaseActivity;
import javax.inject.Inject;

public class MainActivity extends BaseActivity {

  private MainActivityComponent component;
  //@Bind(R.id.iRecyclerView) IRecyclerView recyclerView;
  @Bind(R.id.splash) RelativeLayout relativeLayout;

  @Inject
  RestApiStore apiStore;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    DaggerMainActivityComponent.builder().build().inject(this);
    ButterKnife.bind(this);
    Toast.makeText(this,apiStore.s,Toast.LENGTH_SHORT).show();
  }
}

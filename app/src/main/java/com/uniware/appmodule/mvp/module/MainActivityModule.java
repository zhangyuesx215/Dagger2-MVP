package com.uniware.appmodule.mvp.module;

import com.uniware.appmodule.bean.RestApiStore;
import com.uniware.appmodule.bean.Student;
import com.uniware.appmodule.bean.Teacher;
import com.uniware.appmodule.mvp.inject.A;
import com.uniware.appmodule.mvp.inject.B;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

/**
 * Created by ayue on 2017/4/27.
 */
@Module
public class MainActivityModule {

  @Provides
  RestApiStore provideApiStore(){
    return new RestApiStore();
  }

  @A
  @Provides
  Student provideStudentA(){
    return new Student("A");
  }
  @B
  @Provides
  Student provideStudentB(){
    return new Student("B");
  }
  @Named("A")
  @Provides
  Teacher providerA(){
    return new Teacher("A");
  }
  @Named("B")
  @Provides
  Teacher providerB(){
    return new Teacher("B");
  }
}

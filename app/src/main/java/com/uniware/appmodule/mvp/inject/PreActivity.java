package com.uniware.appmodule.mvp.inject;

import java.lang.annotation.Retention;
import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by ayue on 2017/5/4.
 */
@Scope
@Retention(RUNTIME)
public @interface PreActivity {
}

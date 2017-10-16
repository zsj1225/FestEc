package com.zsj.festec.app;

import android.app.Application;

import com.zsj.lib.androidlib.app.app.Latte;

/**
 * 创建者     朱胜军
 * 创建时间   2017/10/15 22:22
 * 描述	      TODO
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   TODO
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}

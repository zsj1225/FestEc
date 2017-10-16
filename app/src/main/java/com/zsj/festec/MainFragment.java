package com.zsj.festec;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.zsj.lib.androidlib.delegates.LatteDelegate;
import com.zsj.lib.androidlib.net.RestClient;
import com.zsj.lib.androidlib.net.callback.IError;
import com.zsj.lib.androidlib.net.callback.IFailure;
import com.zsj.lib.androidlib.net.callback.ISuccess;

/**
 * 创建者     朱胜军
 * 创建时间   2017/10/15 23:28
 * 描述	      TODO
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   TODO
 */
public class MainFragment extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.layout_main;
    }

    @Override
    public void onBindView(@Nullable Bundle bundle, @NonNull View view) {
        testRest();
    }

    public void testRest() {
        RestClient.builder()
                .url("http://news.baidu.com/")
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Toast.makeText(getActivity(), response, Toast.LENGTH_SHORT).show();
                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {
                        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {
                        Toast.makeText(getActivity(), "失败", Toast.LENGTH_SHORT).show();
                    }
                })
                .build()
                .get();
    }
}

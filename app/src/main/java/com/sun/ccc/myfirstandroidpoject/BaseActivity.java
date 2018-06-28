package com.sun.ccc.myfirstandroidpoject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


/**
 * 检查当前活动小技巧:声明BaseActivity,打印文件名
 *
 *
 *
 */
public class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",getClass().getSimpleName());
        ActivityController.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityController.removeActivity(this);
    }
}

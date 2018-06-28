package com.sun.ccc.myfirstandroidpoject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * onCreate():活动生命周期第一步,加载页面
 *
 * setContentView();  加载布局文件
 *
 *button.setOnClickListener();  设置注册按钮的监听器
 *
 *
 *------------------页面销毁重新加载页面,得到销毁前的临时数据----------
 *活动被暂停停止时,如果消耗过大,会销毁活动,保证性能,在销毁活动前,会调用onSaveInstanceState(Bundle outState)方法,将数据保存在outSatte中,
 * 当再次来到这个页面时,如果页面已销毁,重新新建活动,但是之前的数据,可以从 onCreate中的savedInstanceState获取,一般为空,如果销毁过则savedInstanceState有临时数据
 * ----------------------------------------------------------------
 *
 *
 *
 */

public class IndexActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_layout);   //加载页面
        if (null != savedInstanceState){
            String saveData=savedInstanceState.getString("key");
        }
        Button button_login=(Button)findViewById(R.id.button_login); //获取页面按钮
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显示使用Intent活动之间跳转
                Intent intent=new Intent(IndexActivity.this,OneActivity.class);
                startActivity(intent);
            }
        });

    }
}


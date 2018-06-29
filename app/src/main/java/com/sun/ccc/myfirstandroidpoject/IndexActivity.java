package com.sun.ccc.myfirstandroidpoject;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

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
 *按钮点击有两种实现方式:一种时繁琐的匿名,另一种是实现接口(建议)
 *
 */

public class IndexActivity extends BaseActivity implements View.OnClickListener{

    private EditText et;

    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        case R.id.button_login:


                //进度条点击增加值
//            int progress=progressBar.getProgress();
//            progress=progress+10;
//            progressBar.setProgress(progress);

            //切换图片显示/隐藏
//            if(progressBar.getVisibility() == View.GONE){
//                progressBar.setVisibility(View.VISIBLE);
//            }else{
//                progressBar.setVisibility(View.GONE);
//            }


       /* 代码切换图片
       imageView.setImageResource(R.drawable.baidupng2);*/

            //显示使用Intent活动之间跳转
            Intent intent = new Intent(IndexActivity.this, HomeActivity.class);
            startActivity(intent);
            break;
            default:
                break;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_layout);   //加载页面
        if (null != savedInstanceState){
            String saveData=savedInstanceState.getString("key");
        }
        Button button_login=(Button)findViewById(R.id.button_login); //获取页面按钮
        et=(EditText)findViewById(R.id.edit_text_username);
        imageView=(ImageView)findViewById(R.id.image_view_login);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar_index);
          button_login.setOnClickListener(this);

    }




//    @Override//老式写法,代码啰嗦,复杂,建议直接实现接口
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_index_layout);   //加载页面
//        if (null != savedInstanceState){
//            String saveData=savedInstanceState.getString("key");
//        }
//        Button button_login=(Button)findViewById(R.id.button_login); //获取页面按钮
//        button_login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //显示使用Intent活动之间跳转
//                Intent intent=new Intent(IndexActivity.this,HomeActivity.class);
//                startActivity(intent);
//            }
//        });
//
//    }
}


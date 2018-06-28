package com.sun.ccc.myfirstandroidpoject;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


/**
 *
 *  intent.putExtra("message",data);:把需要传入的数据绑定到Intent中,跳转页面时带过去
 *
 *  -----------数据传输------------
 *  startActivity(intent);  :只能传数据给对方没有返回
 *  startActivityForResult(intent,1);  :传数据给目标活动,并且在目标销毁前,返回数据给自己
 *  onActivityResult(int requestCode, int resultCode, @Nullable Intent data); //方法:接受交互目标传过来的数据
 *
 *  -------------------------------------
 *
 *
 *
 */
public class OneActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_layout);
        Button bu=(Button)findViewById(R.id.button_select);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  data="你吃了吗";
                Intent intent=new Intent(OneActivity.this,TwoActivity.class);
                intent.putExtra("message",data);
               startActivityForResult(intent,1);
            }
        });


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String date="临时数据";
        outState.putString("key",date);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String returnData=data.getStringExtra("return_data");
                    Log.d("OneActivity",returnData);
                }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}

package com.sun.ccc.myfirstandroidpoject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TwoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_layout);
        Button button=(Button)findViewById(R.id.button_return);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //接受穿过来的数据
                Intent in=getIntent();
                String data=in.getStringExtra("message");
                Log.d("TwoActivity",data);
                //返回数据
                Intent intent=new Intent();
                intent.putExtra("return_data","吃了");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}

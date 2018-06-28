package com.sun.ccc.myfirstandroidpoject;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Intent.ACTION_DIAL:调用拨号组件
 * Intent.ACTION_VIEW:调用浏览器插件
 *
 *
 *
 *
 */

public class HomeActivity extends BaseActivity {
    /**
     * Toast:短暂显示内容,然后消失
     *onCreateOptionsMenu():创建菜单
     * onOptionsItemSelected():点击菜单内按钮时响应方法
     */

    @Override//创建菜单
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override//菜单点击响应方法
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "添加页面", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help_item:
                Toast.makeText(this, "帮助页面", Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);

        //调用拨号键盘
//        Button button_url=(Button)findViewById(R.id.button_url);
//        button_url.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);
//            }
//        });


//        button_url.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {//
//                Intent in=new Intent("com.sun.ccc.myfirstandroidpoject.ACTION_START");//满足名称和分类跳转
//                in.addCategory("com.sun.ccc.myfirstandroidpoject.MY_CAT");
//                startActivity(in);
//            }
//        });

//        Button button=(Button)findViewById(R.id.button_to_tel);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent("com.sun.ccc.myfirstandroidpoject.ACTION_START");  //Intent隐式用法
//                intent.addCategory("com.sun.ccc.myfirstandroidpoject.MY_CATEGORY");
//                startActivity(intent);
//            }
//        });
    }
}

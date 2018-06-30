package com.sun.ccc.myfirstandroidpoject;



import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
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

public class HomeActivity extends BaseActivity implements  View.OnClickListener{
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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_dialog:
                AlertDialog.Builder dialog=new AlertDialog.Builder(HomeActivity.this);
                dialog.setTitle("警告");
                dialog.setMessage("这是一个弹窗对话框");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }
                );
                dialog.show();
                break;
            case R.id.button_progressDialou:
                ProgressDialog progressDialog=new ProgressDialog(HomeActivity.this);
                progressDialog.setTitle("等待");
                progressDialog.setMessage("带进度条的弹出");
                progressDialog.setCancelable(true);//true时可通过back键返回
                progressDialog.show();
                break;
            case R.id.button_uiActivity:
                Intent intent=new Intent(HomeActivity.this,UIActivity.class);
                startActivity(intent);
                break;
            case R.id.button_show_list:
                Intent intent_to_showListActivity=new Intent(HomeActivity.this,ListViewActivity.class);
                startActivity(intent_to_showListActivity);

            case R.id.button_show_recyclerView:
                Intent intent_to_recyclerActivity=new Intent(HomeActivity.this,RecyclerView_Activity.class);
                startActivity(intent_to_recyclerActivity);
                break;
        }
    }

    @Override//菜单点击响应方法
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.exit_item:
                ActivityController.finishAll();
                android.os.Process.killProcess(android.os.Process.myPid()); //杀死进程
            case R.id.add_item:
                Toast.makeText(this, "添加页面", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help_item:
                Toast.makeText(this, "帮助页面", Toast.LENGTH_SHORT).show();
                break;



                default:
                    break;
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);



        //警告弹窗
        Button button_dialog=(Button)findViewById(R.id.button_dialog);
        button_dialog.setOnClickListener(this);
        //进度条弹窗
        Button button_progressDialog=(Button)findViewById(R.id.button_progressDialou);
        button_progressDialog.setOnClickListener(this);
        //跳UI页面
        Button button_uiActivity=(Button)findViewById(R.id.button_uiActivity);
        button_uiActivity.setOnClickListener(this);
        //跳转滑动加载列表页面
        Button button_show_list =(Button)findViewById(R.id.button_show_list);
        button_show_list.setOnClickListener(this);


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

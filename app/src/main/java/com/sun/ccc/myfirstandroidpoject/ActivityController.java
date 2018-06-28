package com.sun.ccc.myfirstandroidpoject;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;


/**
 * 活动管理:
 * 批量退出逐渐,如果之前已经开了很多组件,点击home只是暂停,关闭全部组件会很多部,此方法可一次关闭很多组件
 */
public class ActivityController {
    public static List<Activity> activitys=new ArrayList<>();



    //添加
    public static  void  addActivity(Activity activity){
        activitys.add(activity);

    }

    //移除
    public static void  removeActivity(Activity activity){
        activitys.remove(activity);
    }

    //批量销毁
    public static void  finishAll(){
        for (Activity  actity: activitys) {
            if(!actity.isFinishing()){
                actity.finish();
            }

        }

    }

}

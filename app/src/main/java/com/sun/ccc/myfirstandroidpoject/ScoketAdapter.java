package com.sun.ccc.myfirstandroidpoject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ScoketAdapter extends ArrayAdapter<Scoket>{

    private int resourceId;

    //重写父类构造函数,将上下文,listView的子项布局的id和数据传入进来
    public  ScoketAdapter(Context context, int textViewResourceId, List<Scoket> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @NonNull
    @Override//重写方法
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Scoket scoket=getItem(position);//获取当前项的对象实例


        View view;//优化:第一次加载后缓存到convertView,之后convertView不为空,则从缓存里面取
        ViewHolder viewHolder;
        if (null == convertView){ //convertView是第一次加载后布局缓存这个对象中,之后需要布局优先从里获取
             view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

            viewHolder=new  ViewHolder();
            viewHolder.scoketImage=(ImageView)view.findViewById(R.id.scoket_image);
            viewHolder.scoketName=(TextView)view.findViewById(R.id.scoket_name);
            view.setTag(viewHolder);
        }else{
            view= convertView;
            viewHolder=(ViewHolder)view.getTag();
        }

        viewHolder.scoketImage.setImageResource(scoket.getImageId());
        viewHolder.scoketName.setText(scoket.getName());



//        //获取图片,啰嗦基本代码,已被上面ViewHolder优化
//        ImageView scoketImage=(ImageView)view.findViewById(R.id.scoket_image);
//        //获取名称
//        TextView scoketName=(TextView)view.findViewById(R.id.scoket_name);
//
//        scoketImage.setImageResource(scoket.getImageId());
//
//        scoketName.setText(scoket.getName());

        return view;
    }

    class ViewHolder {//优化:新增内部类,对控件的实例进行缓存

        ImageView scoketImage;

        TextView scoketName;

    }
}

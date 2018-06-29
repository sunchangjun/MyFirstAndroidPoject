package com.sun.ccc.myfirstandroidpoject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ListViewActivity extends BaseActivity {

    private  String[] data={"跨境通","国金证券","国信证券","同花顺","恒邦股份","太阳纸业","晨岭职业","万丰奥威","兔宝宝","GQY视讯","新文化","千山药业"
    ,"珠海港","宁波港","水井坊","宁波中百","王府井","山西汾酒","宁波水表","四川路桥","重庆路桥"};

    private List<Scoket> fruitList = new ArrayList<Scoket>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_layout);
        //初始化数据
        initSockets();
        //创建转接器
        ScoketAdapter scoketAdapter=new ScoketAdapter(ListViewActivity.this,R.layout.scoket_layout,fruitList);
        //
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(scoketAdapter);

        listView.setOnItemClickListener(new  AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Scoket scoket=fruitList.get(i);
                Toast.makeText(ListViewActivity.this, scoket.getName(), Toast.LENGTH_SHORT).show();
            }
        });


//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView=(ListView)findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
    }

    private void initSockets(){
        for (int i=0;i<2;i++){
            Scoket apple = new Scoket("Apple", R.drawable.apple_pic);
            fruitList.add(apple);
            Scoket banana = new Scoket("Banana", R.drawable.banana_pic);
            fruitList.add(banana);
            Scoket orange = new Scoket("Orange", R.drawable.orange_pic);
            fruitList.add(orange);
            Scoket watermelon = new Scoket("Watermelon", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Scoket pear = new Scoket("Pear", R.drawable.pear_pic);
            fruitList.add(pear);
            Scoket grape = new Scoket("Grape", R.drawable.grape_pic);
            fruitList.add(grape);
            Scoket pineapple = new Scoket("Pineapple", R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Scoket strawberry = new Scoket("Strawberry", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Scoket cherry = new Scoket("Cherry", R.drawable.cherry_pic);
            fruitList.add(cherry);
            Scoket mango = new Scoket("Mango", R.drawable.mango_pic);
            fruitList.add(mango);
        }

    }
}

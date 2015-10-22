package com.example.llw.demo_listview_baseapdater1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);
        listView = (ListView) findViewById(R.id.list_item);
        Mybaseapdater mybaseapdater  = new Mybaseapdater();
        listView.setAdapter(mybaseapdater);

    }


    public  class  Mybaseapdater extends BaseAdapter{

        @Override
        public int getCount() {
            return 80;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
           // convertView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.activity_main,null);

            //第一种：获取layoutinflater对象的方法
            LayoutInflater layoutInflater = getLayoutInflater();//获取layoutinflate对象
             layoutInflater.from(getApplicationContext());//获取此上下文
           convertView =  layoutInflater.inflate(R.layout.activity_main,null);//获取xml实例

          /*  //第二种获取layoutinflater对象的方法
            LayoutInflater layoutInflater1 = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layoutInflater1.from(getApplicationContext());
            layoutInflater1.inflate(R.layout.activity_main,null);*/


         /*   TextView textView = new TextView(MainActivity.this);
            textView.setText("hello word my name is Lisi and what your name?");
            textView.setTextColor(Color.RED);*/
            TextView textView = (TextView) convertView.findViewById(R.id.text);
            textView.setText("hello word!");
            textView.setTextColor(Color.RED);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
            imageView.setImageResource(R.drawable.ic_launcher);
            return convertView;
        }
    }
}

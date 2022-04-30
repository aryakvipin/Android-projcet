package com.example.my_android_projcets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustemAdapter extends BaseAdapter
{
    Context context;
    int fruitimage[];
    String fruitname[];
    LayoutInflater inflater;
    public CustemAdapter(Context applicationContext, int[] fruitimage, String[] fruitsname) {
        context =applicationContext;
        this.fruitimage=fruitimage;
        this.fruitname=fruitsname;
    }

    @Override
    public int getCount() {
        return fruitimage.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.secondlayour,null);
        TextView tv=(TextView) view.findViewById(R.id.food);
        ImageView img=(ImageView) view.findViewById(R.id.foodimg);
        tv.setText(fruitname[i]);
      img.setImageResource(fruitimage[i]);
        return view;
    }
}

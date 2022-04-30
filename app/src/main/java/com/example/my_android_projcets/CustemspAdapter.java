package com.example.my_android_projcets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustemspAdapter extends BaseAdapter {
    Context context;
    String countryname[];
    int countryimg[];
    LayoutInflater inflaterr;
    public CustemspAdapter(Context applicationContext, int[] countryimg, String[] countryname) {
        context =applicationContext;
     this.countryname=countryname;
     this.countryimg=countryimg;

    }

    @Override
    public int getCount() {
        return  countryname.length;
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
        inflaterr=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflaterr.inflate(R.layout.countrylyer,null);
        TextView ctv=(TextView) view.findViewById(R.id.countryname);
        ImageView cimg=(ImageView) view.findViewById(R.id.countryimage);
        ctv.setText(countryname[i]);
        cimg.setImageResource(countryimg[i]);
        return view;


    }
}

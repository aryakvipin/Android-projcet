package com.example.my_android_projcets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
     Context mContext;
      String[] gridViewString;
      int[] gridViewImageId;
    LayoutInflater einflater;

    public GridAdapter(Context applicationContext, int[] gridimg, String[] gridtext) {
        mContext = applicationContext;
        this.gridViewImageId = gridimg;
        this.gridViewString = gridtext;
    }

    @Override
    public int getCount() {
        return   gridViewString.length;
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
        einflater=(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=einflater.inflate(R.layout.gridlaout,null);
        TextView tv=(TextView) view.findViewById(R.id.gridview_text);
        ImageView img=(ImageView) view.findViewById(R.id.gridview_image);
        tv.setText(gridViewString[i]);
        img.setImageResource(gridViewImageId[i]);
        return view;
    }
}

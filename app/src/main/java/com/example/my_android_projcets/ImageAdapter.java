package com.example.my_android_projcets;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mcontext;


    public ImageAdapter(Context c) {
        mcontext=c;

    }

    @Override
    public int getCount() {
        return gridimages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(mcontext);

        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(gridimages[position]);

        return imageView;
    }
    Integer []gridimages={
            R.drawable.image,R.drawable.file,R.drawable.calender,R.drawable.calculater,
            R.drawable.fm,R.drawable.camera,R.drawable.calock,R.drawable.chrome,R.drawable.settinigs,R.drawable.conatct,
            R.drawable.playstore
    };
}

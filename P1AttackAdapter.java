package com.example.ul.battleship12;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class P1AttackAdapter extends BaseAdapter {
    private Context mContext;

    public P1AttackAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIdsA1.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 75));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIdsA1[position]);
        return imageView;
    }

    public static Integer[] mThumbIdsA1 = {
            R.drawable.white, R.drawable.squarea,
            R.drawable.squareb, R.drawable.squarec,
            R.drawable.squared, R.drawable.squaree,
            R.drawable.squaref, R.drawable.squareg,
            R.drawable.squareh, R.drawable.squarei,
            R.drawable.squarej, R.drawable.square1,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.square2, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.square3,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.square4, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.square5,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.square6, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.square7,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.square8, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.square9,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.square10, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black, R.drawable.black,
            R.drawable.black,
    };

}


package edu.poly.demoslideimage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class AdapterMain extends PagerAdapter {
    private ArrayList<Photo> mlist;

    public AdapterMain(ArrayList<Photo> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.layout_item, container,false);
        ImageView img = view.findViewById(R.id.img_photo);


        Photo photo = mlist.get(position);
        img.setImageResource(photo.getImage());
        container.addView(view);
        return view;

    }

    @Override
    public int getCount() {
        if(mlist != null){
            return mlist.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView((View) object);
    }
}

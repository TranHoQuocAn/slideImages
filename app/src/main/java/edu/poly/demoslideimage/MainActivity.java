package edu.poly.demoslideimage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;
import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager2;
    CircleIndicator circleIndicator3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void initView() {
        viewPager2 = findViewById(R.id.viewPager);
        circleIndicator3 = findViewById(R.id.CircleIndicator3);
    }

    private void loadData() {
        ArrayList<Photo> list = getListPhoto();
        AdapterMain adapterMain = new AdapterMain(list);
        viewPager2.setAdapter(adapterMain);
        circleIndicator3.setViewPager(viewPager2);
    }

    @NonNull
    private ArrayList<Photo> getListPhoto() {
        ArrayList<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.img));
        list.add(new Photo(R.drawable.img1));
        list.add(new Photo(R.drawable.img3));
        list.add(new Photo(R.drawable.img4));
        return list;
    }
}
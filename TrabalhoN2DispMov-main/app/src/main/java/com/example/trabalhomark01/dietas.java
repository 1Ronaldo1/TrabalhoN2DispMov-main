package com.example.trabalhomark01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class dietas extends AppCompatActivity {

    private ViewPager mSlideViewPager2;
    private SlideAdapter2 sliderAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietas);
        getSupportActionBar().hide();

        //Busca o ID e adiciona no objeto mSlideViewPager
        mSlideViewPager2 = findViewById(R.id.slideViewPager2);
        //Executa os códigos na tela SlideAdapter
        sliderAdapter2 = new SlideAdapter2(this);
        mSlideViewPager2.setAdapter(sliderAdapter2);


    }




}
package com.example.administrator.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

private FragmentManager fm=getSupportFragmentManager();
private FragmentTransaction ft;
private int frame_id=R.id.frame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ft=fm.beginTransaction();
        ft.replace(frame_id,new Fragment1()).commit();
    }

    public void first(View view) {
        ft=fm.beginTransaction();
        ft.replace(frame_id,new Fragment1()).commit();
    }

    public void sec(View view) {
        ft=fm.beginTransaction();
        ft.replace(frame_id,new Fragment2()).commit();
    }

    public void three(View view) {
        ft=fm.beginTransaction();
        ft.replace(frame_id,new Fragment3()).commit();
    }
}
/**
 * 布局中替换空间用Fragmentlayout,
 * ft事务只能提交一次，再次提交需要重新实例化
 */
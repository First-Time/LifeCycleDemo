package com.lyf.lifecycle.fragment.basic.java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.lyf.lifecycle.R;

public class JavaFragmentActivity extends AppCompatActivity {
    private static final String TAG = JavaFragmentActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(TAG + " onCreate");
        if (savedInstanceState != null) {
            String params = savedInstanceState.getString("JavaFragmentActivity");
            System.out.println(TAG + " on " + params);
        }

        setContentView(R.layout.activity_java_fragment);

        Button fragment1Button = findViewById(R.id.btn_fragment1);
        Button fragment2Button = findViewById(R.id.btn_fragment2);
        Button fragment3Button = findViewById(R.id.btn_fragment3);

        final Fragment fragment1 = JavaFragment1.newInstance("", "");
        final Fragment fragment2 = JavaFragment2.newInstance("", "");
        final Fragment fragment3 = JavaFragment3.newInstance("", "");

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment1);
        fragmentTransaction.commit();

        fragment1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragment1);
//                fragmentTransaction.addToBackStack("fragment1");
                fragmentTransaction.commit();

                /*FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.frameLayout, fragment1);
                fragmentTransaction.add(R.id.frameLayout, fragment2);
                fragmentTransaction.addToBackStack("fragment1");
                fragmentTransaction.addToBackStack("fragment2");
                fragmentTransaction.commit();*/
            }
        });

        fragment2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragment2);
//                fragmentTransaction.addToBackStack("fragment2");
                fragmentTransaction.commit();

                /*FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.popBackStack();*/
            }
        });

        fragment3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragment3);
//                fragmentTransaction.addToBackStack("fragment3");
                fragmentTransaction.commit();

                /*FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragment3);
                fragmentTransaction.addToBackStack("fragment3");
                fragmentTransaction.commit();*/
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println(TAG + " onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(TAG + " onStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        System.out.println(TAG + " onRestoreInstanceState");
        if (savedInstanceState != null) {
            String params = savedInstanceState.getString("JavaFragmentActivity");
            System.out.println(TAG + " on " + params);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(TAG + " onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println(TAG + " onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("JavaFragmentActivity", "JavaFragmentActivity");
        System.out.println(TAG + " onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(TAG + " onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(TAG + " onDestroy");
    }
}

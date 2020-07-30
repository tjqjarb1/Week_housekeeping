package com.example.week_housekeeping.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.week_housekeeping.R;

public class MainActivity extends AppCompatActivity {

    private Flag1 frag1;
    private Flag2 frag2;
    private Flag3 frag3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = new Flag1(); //프래그먼트 객체 생성
        frag2 = new Flag2(); //프래그먼트 객체 생성
        frag3 = new Flag3(); //프래그먼트 객체 생성
        //frag4 = new Flag1(); //프래그먼트 객체 생성

        ((RelativeLayout) findViewById(R.id.main_bot_btn1)).setOnClickListener(mView_Click);
        ((RelativeLayout) findViewById(R.id.main_bot_btn2)).setOnClickListener(mView_Click);
        ((RelativeLayout) findViewById(R.id.main_bot_btn3)).setOnClickListener(mView_Click);
        ((RelativeLayout) findViewById(R.id.main_bot_btn4)).setOnClickListener(mView_Click);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, frag1).commit(); /*프래그먼트 매니저를 사용해서 프래그먼트를 할당함.*/
    }

    private View.OnClickListener mView_Click = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = null;

            switch (v.getId()){
                case R.id.main_bot_btn1:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, frag1).commit();
                    break;

                case R.id.main_bot_btn2:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, frag2).commit();
                    break;

                case R.id.main_bot_btn3:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, frag3).commit();
                    break;

                case R.id.main_bot_btn4:
                    break;
            }
        }
    };
}

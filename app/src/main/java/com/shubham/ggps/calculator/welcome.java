package com.shubham.ggps.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class welcome extends Activity {
Thread a;
ImageView img;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //img=(ImageView)findViewById(R.id.img);
     //   animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
      //  img.startAnimation(animation);
       a=new Thread(){
            public void run(){
                try{
                    a.sleep(7000);
                    Intent i=new Intent(getApplicationContext(),MyActivity.class);
                    startActivity(i);
                }catch (Exception e){


                }
            }

        };
        a.start();
    }


}

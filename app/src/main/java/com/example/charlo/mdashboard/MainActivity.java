package com.example.charlo.mdashboard;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameuser, walletuser, review, network, plugins, myapps, mainmenus,
            pagetitle, pagesubtitle;

    Button btnguide;
    ImageView imageView3;
    Animation agt;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameuser = findViewById(R.id.nameuser);
        walletuser = findViewById(R.id.walletuser);
        imageView3 = findViewById(R.id.imageView3);
        pagesubtitle = findViewById(R.id.pagesubtitle);
        pagetitle = findViewById(R.id.pagetitle);

        review = findViewById(R.id.review);
        network = findViewById(R.id.network);
        plugins = findViewById(R.id.plugins);
        myapps = findViewById(R.id.myapps);
        mainmenus = findViewById(R.id.mainmenus);

        agt = AnimationUtils.loadAnimation(this,R.animator.atg);
        imageView3.startAnimation(agt);
        pagetitle.startAnimation(agt);
        pagesubtitle.startAnimation(agt);


        btnguide = findViewById(R.id.btnguide);
    }
}

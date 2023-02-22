package com.example.todayfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    LinearLayout change_button_LL;
    ImageView change_image_view_IV;
    Animation rotate_A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        change_button_LL = findViewById(R.id.change_layout);
        change_image_view_IV = findViewById(R.id.change_Imageview);
        rotate_A = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        change_image_view_IV.startAnimation(rotate_A);

        change_button_LL.setOnClickListener(v -> { reset_game();});

    }
    public void reset_game(){
        change_image_view_IV.startAnimation(rotate_A);

    }


}

package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton ib;
    int random = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.imageView);
        ib = (ImageButton) findViewById(R.id.imageButton);
    }

    public void randomNumber(View view)
    {
        random = (int)(Math.random()* (3-1))+1;
        if(random == 1)
        {
            iv.setImageResource(R.drawable.num1);
            ib.setForeground(R.drawable.one);
        }
        else if(random == 2)
        {
            iv.setImageResource(R.drawable.num2);
        }
        else
        {
            iv.setImageResource(R.drawable.num3);
        }
    }
}
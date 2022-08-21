package com.example.mycw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalis);

        Bundle receive = getIntent().getExtras();


        TextView namme = findViewById(R.id.textName);
        TextView moneyy = findViewById(R.id.money);
        TextView des = findViewById(R.id.description);
        ImageView picture = findViewById(R.id.imageView2);


        items current = (items) receive.getSerializable("current");


        namme.setText(current.getItemName());
        moneyy.setText(String.valueOf(current.getItemPrice()));
        picture.setImageResource(current.getItemImage());
        des.setText(current.getProDescription());
    }
}
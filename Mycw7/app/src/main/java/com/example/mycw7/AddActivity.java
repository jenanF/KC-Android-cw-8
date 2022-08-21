package com.example.mycw7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        EditText name = findViewById(R.id.Iname);
        EditText price = findViewById(R.id.Iprice);
        ImageView added = findViewById(R.id.imageAdded);
        ImageView done = findViewById(R.id.imageDone);






        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back = new Intent(AddActivity.this, MainActivity.class);
                startActivity(back);
            }
        });



    }




    }








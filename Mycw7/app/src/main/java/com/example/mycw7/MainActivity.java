package com.example.mycw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<items> shop = new ArrayList<>();

    ArrayList<Integer> shops = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        items iceCoffee = new items("iceCoffee", R.drawable.icecoffee,2.00,"small iced coffee");
        items hotCoffee = new items("Americano", R.drawable.hot1coffee, 1.800, "small Americano");
        items mocha = new items("mocha", R.drawable.creamcoffee, 2.100, "small iced mocha");
        items pink = new items("pink latte", R.drawable.pink, 2.250," small pink latte");
        items flat = new items("flat white", R.drawable.cofart, 1.750, "large flat white");
        items cupCake = new items("cupCake", R.drawable.cupcake, 2.500,"cupCake 1pc");
        items donut = new items("donut", R.drawable.donuts, 1.00, "donut 1pc");
        items cookies = new items("cookies", R.drawable.cookies, 1.250, "cookies 2pc");
        items cake = new items("cake", R.drawable.cake, 3.500, "4inch chocolate cake");
        items pie = new items("pie", R.drawable.pie, 4.500, "apple pie");


        shop.add(iceCoffee);
        shop.add(hotCoffee);
        shop.add(mocha);
        shop.add(pink);
        shop.add(flat);
        shop.add(cupCake);
        shop.add(donut);
        shop.add(cookies);
        shop.add(cake);
        shop.add(pie);



        shopAdapter shopAdapter = new shopAdapter(this,0,shop);

        ListView listView= findViewById(R.id.listItems);

        listView.setAdapter(shopAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                items current = shop.get(i);

                Intent deta = new Intent(MainActivity.this, DetalisActivity.class);

                deta.putExtra("current", current);

                startActivity(deta);


            }
        });

        ImageView add = findViewById(R.id.imageAdd);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent addItem = new Intent(MainActivity.this, AddActivity.class);
                startActivity(addItem);
            }
        });








//        EditText name = findViewById(R.id.Iname);
//        EditText price = findViewById(R.id.Iprice);

//        added.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                int count = shops.size()+1;
//
//                items n = new items(name.getText().toString(),R.drawable.ic_image ,Double.parseDouble(price.getText().toString()),"new item");
//
//                shop.add(shops);
//
//
//
//
//            }
//        });



    }
}
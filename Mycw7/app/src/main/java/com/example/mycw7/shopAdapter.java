package com.example.mycw7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class shopAdapter extends ArrayAdapter {

    List<items> shopList;

    public shopAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        shopList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.shop_layout,parent, false);

        items currntItem = shopList.get(position);

        TextView itemName = view.findViewById(R.id.name);
        TextView Iprice = view.findViewById(R.id.price);
        TextView Inumber = view.findViewById(R.id.number);
        ImageView pic = view.findViewById(R.id.itemimages);
        ImageView del = view.findViewById(R.id.button3);

        itemName.setText(currntItem.getItemName());
        Inumber.setText( String.valueOf(currntItem.getItemPrice()));
        pic.setImageResource(currntItem.getItemImage());

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dialog;
                dialog= new AlertDialog.Builder(getContext());
                dialog.setCancelable(false);
                dialog.setTitle("Delete item");
                dialog.setMessage("Are you sure you ?");
                dialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {


                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                remove(currntItem);
                                notifyDataSetChanged();
                                Snackbar snackbar = Snackbar.make(view,"item has been deleted", Snackbar.LENGTH_LONG);
                                snackbar.show();

                            }
                        })

                        .setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });

                AlertDialog alertD =  dialog.create();
                alertD.show();




            }
        });

        return view;

    }
}

package com.example.crud_php_mysql_android_072022;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<Usuarios> {

    Context context;
    List<Usuarios> arrayusuarios;

    public Adapter(@NonNull Context context, List<Usuarios> arrayusuarios) {
        super(context, R.layout.list_usuarios,arrayusuarios);
        this.context =context;
        this.arrayusuarios =arrayusuarios;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_usuarios,null,true);

        TextView tvID = view.findViewById(R.id.txt_id);
        TextView tvName = view.findViewById(R.id.txt_name);

        tvID.setText(arrayusuarios.get(position).getId());
        tvName.setText(arrayusuarios.get(position).getNombre());

        return view;
    }
}
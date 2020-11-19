package com.task.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class drink_menu extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {
            R.drawable.coca_cola,
            R.drawable.sprite,
            R.drawable.fanta,
            R.drawable.pepsi,
            R.drawable.seven_up,
            R.drawable.evian};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_menu);
        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.drinks_array);
        s2 = getResources().getStringArray(R.array.drinks_price);

        adapterView adapter = new adapterView(this, s1, s2, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void myOrderButton(View view) {
        Intent intent = new Intent(this,my_order_menu.class);
        startActivity(intent);
    }

}
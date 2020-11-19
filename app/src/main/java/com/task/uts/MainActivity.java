package com.task.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drinkButton(View view) {
        Intent intent = new Intent(this,drink_menu.class);
        startActivity(intent);
    }

    public void foodButton (View view){
        Context context = getApplicationContext();
        CharSequence text = "This feature isn't available yet!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void snackButton (View view){
        Context context = getApplicationContext();
        CharSequence text = "This feature isn't available yet!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void myOrderButton (View view){
        Intent intent = new Intent(this,my_order_menu.class);
        startActivity(intent);
    }

    public void topupButton (View view){
        Context context = getApplicationContext();
        CharSequence text = "This feature isn't available yet!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }









}


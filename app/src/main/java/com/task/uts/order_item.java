package com.task.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class order_item extends AppCompatActivity {

    ImageView imageView;
    TextView name, price;
    String data1, data2;
    int theImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_item);

        imageView = findViewById(R.id.checkoutImage);
        name = findViewById(R.id.orderName);
        price = findViewById(R.id.orderPrice);

        getData();
        setData();

    }

    public void myOrderButton_CF(View view) {
        Intent intent = new Intent(this, my_order_menu.class);
        EditText qtyText = (EditText) findViewById(R.id.quantity);
        int qtyNum = 0;
        try {
            qtyNum = Integer.parseInt(qtyText.getText().toString());
        } catch(NumberFormatException e) {
            Toast.makeText(this, "Fill the data please", Toast.LENGTH_SHORT).show();
        }
        int priceNum = 6;

        if (getIntent().getStringExtra("data1").equals("Coca Cola")){
            priceNum = 0;
        }else if(getIntent().getStringExtra("data1").equals("Sprite")){
            priceNum = 1;
        }else if(getIntent().getStringExtra("data1").equals("Fanta")){
            priceNum = 2;
        }else if(getIntent().getStringExtra("data1").equals("Pepsi")){
            priceNum = 3;
        }else if(getIntent().getStringExtra("data1").equals("7UP")){
            priceNum = 4;
        }else if(getIntent().getStringExtra("data1").equals("Evian")){
            priceNum = 5;
        }
        intent.putExtra("quantity", qtyNum);
        intent.putExtra("priceNum", priceNum);
        intent.putExtra("prodName", data1);


        startActivity(intent);
    }

    public void myOrderButton_NS(View view) {
        Intent intent = new Intent(this, my_order_menu.class);
        startActivity(intent);
    }

    private void getData (){
        if (getIntent().hasExtra("proImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")) {

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            theImage = getIntent().getIntExtra("proImage", 1);
        }else{
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData (){

        name.setText(data1);
        price.setText(data2);
        imageView.setImageResource(theImage);
    }

    public void myOrderButton(View view) {
        Intent intent = new Intent(this,my_order_menu.class);
        startActivity(intent);
    }


}
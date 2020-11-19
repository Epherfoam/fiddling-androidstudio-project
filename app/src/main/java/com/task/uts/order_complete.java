package com.task.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class order_complete extends AppCompatActivity {

    TextView price, prodName, qty, totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);
        String priceD = getIntent().getStringExtra("priceD");
        Integer quantityD = getIntent().getIntExtra("quantityD", 0);
        String productD = getIntent().getStringExtra("prodNameD");
        String totalPriceD = getIntent().getStringExtra("totalPriceD");


        prodName = findViewById(R.id.orderName);
        prodName.setText(productD);

        price = findViewById(R.id.orderPrice);
        price.setText(priceD);

        qty = findViewById(R.id.orderQuantity);
        qty.setText(quantityD + "  X");

        totalPrice = findViewById(R.id.totalPrice);
        totalPrice.setText(totalPriceD);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
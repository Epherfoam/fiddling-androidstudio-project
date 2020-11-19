package com.task.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class my_order_menu extends AppCompatActivity {

    TextView price,prodName,qty,totalPrice;
    String priceD,prodNameD, totalPriceD, deleted=null;
    Integer qtyD;
    Boolean activeClick=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order_menu);
        int priceNumb = getIntent().getIntExtra("priceNum", 6);
        int quantity = getIntent().getIntExtra("quantity", 0);
        String product = getIntent().getStringExtra("prodName");
        int[] prices = {8000,7000,8000,7000,10000,16000,0};
        int total = quantity * prices[priceNumb];

        prodName = findViewById(R.id.orderName);
        prodName.setText(product);
        prodNameD = getIntent().getStringExtra("prodName");

        price = findViewById(R.id.orderPrice);
        price.setText(String.valueOf("Rp"+prices[priceNumb]));
        priceD = String.valueOf("Rp"+prices[priceNumb]);


        qty = findViewById(R.id.orderQuantity);
        qty.setText(String.valueOf(quantity) + "  X");
        qtyD = getIntent().getIntExtra("quantity", 0);

        totalPrice = findViewById(R.id.totalPrice);
        totalPrice.setText(String.valueOf("Rp"+total));
        totalPriceD = Integer.toString(total);


    }

    public void orderComplete(View view) {
        Intent intent = new Intent(this, order_complete.class);

        if (activeClick == true){
            intent.putExtra("quantityD", deleted);
            intent.putExtra("priceD", deleted);
            intent.putExtra("prodNameD", deleted);
            intent.putExtra("totalPriceD", deleted);
        }else {
            intent.putExtra("quantityD", qtyD);
            intent.putExtra("priceD", priceD);
            intent.putExtra("prodNameD", prodNameD);
            intent.putExtra("totalPriceD", totalPriceD);
        }




        startActivity(intent);
    }

    public void deleteAll(View view) {

        prodName = findViewById(R.id.orderName);
        prodName.setText("");

        price = findViewById(R.id.orderPrice);
        price.setText("");

        qty = findViewById(R.id.orderQuantity);
        qty.setText("");

        totalPrice = findViewById(R.id.totalPrice);
        totalPrice.setText("");

        totalPrice = findViewById(R.id.total);
        totalPrice.setText("");

        Button button = (Button) findViewById(R.id.delete);
        view.setVisibility(View.GONE);

        activeClick = true;

    }


}
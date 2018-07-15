package com.example.samsung.toggle_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBox_Example extends AppCompatActivity {

    CheckBox pizza,coffee,burgur;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        addListenerOnButtonClick();


    }

    private void  addListenerOnButtonClick(){

        pizza = (CheckBox) findViewById(R.id.chbox_pizza);
        coffee = (CheckBox) findViewById(R.id.chbox_coffee);
        burgur = (CheckBox) findViewById(R.id.chbox_burgur);
        buttonOrder = (Button)findViewById(R.id.chbt_show);


        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int totalamount = 0;

                StringBuilder result = new StringBuilder();
                result.append("Select Items:");

                if(pizza.isChecked())
                {
                    result.append("\n pizza is Rs 100/-");
                    totalamount += 100;
                }

                if(coffee.isChecked())
                {
                    result.append("\n coffee is Rs 50/-");
                    totalamount += 50;
                }

                if(burgur.isChecked())
                {
                    result.append("\n burgur is Rs 120/-");
                    totalamount += 120;
                }

                result.append("\n Total: "+totalamount+"Rs");


                //Display Message Through Toast
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();

            }
        });



    }
}

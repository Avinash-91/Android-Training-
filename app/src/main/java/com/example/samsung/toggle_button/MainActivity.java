package com.example.samsung.toggle_button;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btsave;
    ToggleButton Tg1,Tg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btsave = (Button) findViewById(R.id.btSave1);
        Tg1 = (ToggleButton) findViewById(R.id.tog1);
        Tg2= (ToggleButton) findViewById(R.id.tog2);


        btsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                StringBuilder result = new StringBuilder();

                result.append("ToggleButton:").append(Tg1.getText());
                result.append("\n ToggleBUtton1").append(Tg2.getText());
                //Display The Message in Toast

                Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_SHORT).show();

            }
        });


    }
}

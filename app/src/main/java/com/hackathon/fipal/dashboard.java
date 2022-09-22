package com.hackathon.fipal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {

    public static float expenses = 0;

    public static void setexpense(float newexpense){

        expenses += newexpense;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

            TextView leisure = (TextView) findViewById(R.id.leisureView);


            leisure.setText("Leisure \n \n \n " + expenses +"L");

            if(expenses >= 1000.0){

                Toast.makeText(dashboard.this,"Spending too much on leisure!",Toast.LENGTH_LONG).show();

            }

    }


}
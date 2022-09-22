package com.hackathon.fipal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;


public class scanned_increase_expense extends AppCompatActivity {


    public String url;
    public String transmitValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanned_increase_expense);

        url = qr_scanner.getMyString();

        String[] value = url.split("&prc=");

        TextView out = (TextView) findViewById(R.id.billValue);

        String stext = value[1];

        out.setText(stext);


    }

}
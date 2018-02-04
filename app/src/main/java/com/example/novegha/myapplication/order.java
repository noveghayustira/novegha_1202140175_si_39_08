package com.example.novegha.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Order extends AppCompatActivity {
    TextView nama_menu,jumlah_order,total,kafe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Bundle extras = getIntent().getExtras();
        nama_menu = (TextView) findViewById(R.id.nama_menu);
        jumlah_order = (TextView)findViewById(R.id.jumlah_order);
        total= (TextView)findViewById(R.id.total);
        kafe= (TextView)findViewById(R.id.kafe);

        nama_menu.setText(extras.getString("nama_menu"));
        jumlah_order.setText(extras.getString("jumlah_order"));
        kafe.setText(extras.getString("kafe"));
        total.setText(String.valueOf(extras.getInt("total")));
        Toast.makeText(getApplicationContext(),extras.getString("pesan"),Toast.LENGTH_LONG).show();
    }
}

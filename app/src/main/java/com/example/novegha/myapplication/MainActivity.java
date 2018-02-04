package com.example.novegha.myapplication;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nama_menu,jumlah_order;
    Button eatbus,abnormal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama_menu = (EditText)findViewById(R.id.nama_menu);
        jumlah_order = (EditText)findViewById(R.id.jumlah_order);
        eatbus=(Button)findViewById(R.id.eatbus);
        abnormal=(Button)findViewById(R.id.abnormal);
        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Order.class);
                intent.putExtra("nama_menu", nama_menu.getText().toString());
                intent.putExtra("jumlah_order", jumlah_order.getText().toString());
                intent.putExtra("total", (Integer.valueOf(jumlah_order.getText().toString())*30000));
                intent.putExtra("pesan", "Disini aja makan malamnya");
                intent.putExtra("kafe", "ABNORMAL");
                startActivity(intent);
            }
        });
        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Order.class);
                intent.putExtra("nama_menu", nama_menu.getText().toString());
                intent.putExtra("jumlah_order", jumlah_order.getText().toString());
                intent.putExtra("total", (Integer.valueOf(jumlah_order.getText().toString())*50000));
                intent.putExtra("pesan", "Jangan disini makan malamnya, uang nya tidak cukup");
                intent.putExtra("kafe", "EATBUS");
                startActivity(intent);
            }
        });
    }
}

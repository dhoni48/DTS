package com.example.pertemuan9a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nim,nama,kampus;
    TextView t_nim,t_nama,t_kampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nim = findViewById(R.id.edt_nim);
        nama =  findViewById(R.id.edt_nama);
        kampus = findViewById(R.id.edt_kampus);
        t_nim = findViewById(R.id.tv_nim);
        t_nama = findViewById(R.id.tv_nama);
        t_kampus = findViewById(R.id.tv_kampus);
    }

    public void Tampilkan(View v){
        t_nim.setText("NIM kamu adalah " +nim.getText());
        t_nama.setText("Nama kamu adalah " +nama.getText());
        t_kampus.setText("Kampus kamu adalah " +kampus.getText());
    }

    public void Resetkan(View v){
        nim.setText("");
        nama.setText("");
        kampus.setText("");
    }
}

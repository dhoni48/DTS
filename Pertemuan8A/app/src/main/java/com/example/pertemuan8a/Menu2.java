package com.example.pertemuan8a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu2 extends AppCompatActivity {
    EditText inputan;
    TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        inputan = findViewById(R.id.edt_angka);
        tampil = findViewById(R.id.tv_hasil);
    }

    public void Hitung(View v) {

        if (inputan.getText().length() > 0) {
            String masukan = inputan.getText().toString();
            int angka = Integer.parseInt(masukan);
            int b = angka % 2;

            if (b == 0) {
                tampil.setText("Bilangan " + angka + " adalah\nBilangan Genap");
            } else {
                tampil.setText("Bilangan " + angka + " adalah\nBilangan Ganjil");
            }
        }else{
            Toast.makeText(getApplicationContext(),"Mohon Masukkan Data", Toast.LENGTH_LONG).show();
        }
    }
}

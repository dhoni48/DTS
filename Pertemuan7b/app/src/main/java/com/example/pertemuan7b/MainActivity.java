package com.example.pertemuan7b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Input;
    Button Picikan;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input= findViewById(R.id.Edt_Nama);
        Picikan = findViewById(R.id.Btn_Tampil);
        Hasil = findViewById(R.id.Tv_Tampil);
    }

    public void Tampilkan_Nama(View v){
        Hasil.setText("Nama anda adalah " + Input.getText());
    }
}

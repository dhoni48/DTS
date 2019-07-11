package com.example.pertemuan8a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu1 extends AppCompatActivity {
    EditText bilangan_satu, bilangan_dua;
    TextView tampil_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        bilangan_satu = findViewById(R.id.angka_pertama);
        bilangan_dua = findViewById(R.id.angka_kedua);
        tampil_hasil = findViewById(R.id.tv_tampil);
    }
    public void Proses_Tambah(View v){
        if (bilangan_satu.getText().length()>0 && bilangan_dua.getText().length()>0){
            int input_satu = Integer.parseInt(bilangan_satu.getText().toString());
            int input_dua = Integer.parseInt(bilangan_dua.getText().toString());
            int result = input_satu+input_dua;
            tampil_hasil.setText(" " + input_satu + " + " + input_dua + " = " +result);
            Toast.makeText(getApplicationContext(),"Success!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Mohon Masukkan Data", Toast.LENGTH_LONG).show();
        }
    }
    public void Proses_Kurang(View v){
        if (bilangan_satu.getText().length()>0 && bilangan_dua.getText().length()>0){
            int input_satu = Integer.parseInt(bilangan_satu.getText().toString());
            int input_dua = Integer.parseInt(bilangan_dua.getText().toString());
            int result = input_satu-input_dua;
            tampil_hasil.setText(" " + input_satu + " - " + input_dua + " = " +result);
            Toast.makeText(getApplicationContext(),"Success!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Mohon Masukkan Data", Toast.LENGTH_LONG).show();
        }
    }
    public void Proses_Kali(View v){
        if (bilangan_satu.getText().length()>0 && bilangan_dua.getText().length()>0){
            int input_satu = Integer.parseInt(bilangan_satu.getText().toString());
            int input_dua = Integer.parseInt(bilangan_dua.getText().toString());
            int result = input_satu*input_dua;
            tampil_hasil.setText(" " + input_satu + " X " + input_dua + " = " +result);
            Toast.makeText(getApplicationContext(),"Success!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Mohon Masukkan Data", Toast.LENGTH_LONG).show();
        }
    }
    public void Proses_Bagi(View v){
        if (bilangan_satu.getText().length()>0 && bilangan_dua.getText().length()>0){
            int input_satu = Integer.parseInt(bilangan_satu.getText().toString());
            int input_dua = Integer.parseInt(bilangan_dua.getText().toString());
            int result = input_satu/input_dua;
            tampil_hasil.setText(" " + input_satu + " : " + input_dua + " = " +result);
            Toast.makeText(getApplicationContext(),"Success!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Mohon Masukkan Data", Toast.LENGTH_LONG).show();
        }
    }
    public void Proses_Bersihkan(View v){
        bilangan_satu.setText("");
        bilangan_dua.setText("");
    }
}

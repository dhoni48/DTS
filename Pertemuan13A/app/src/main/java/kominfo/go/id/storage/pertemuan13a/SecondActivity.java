package kominfo.go.id.storage.pertemuan13a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText nim, nama;
    TextView tampil, tampil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nim = findViewById(R.id.edtNIM);
        nama = findViewById(R.id.edtNama);
        tampil = findViewById(R.id.tvTampil);
        tampil2 = findViewById(R.id.tvTampil2);
    }

    public void Tampilkan(View v){
        tampil.setText("NIM Anda : " + nim.getText());
        tampil2.setText("Nama Anda : " + nama.getText());
    }


}

package kominfo.go.id.storage.pertemuan15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText et_user, et_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_user = findViewById(R.id.username);
        et_pass = findViewById(R.id.password);
    }

    public void Login_Disini(View v){
        if (et_user.getText().toString().equals("admin") && et_pass.getText().toString().equals("admin")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(LoginActivity.this,"Username atau Password Salah!", Toast.LENGTH_LONG).show();
        }
    }

    public void Keluar(View v){
        finish();
    }
}

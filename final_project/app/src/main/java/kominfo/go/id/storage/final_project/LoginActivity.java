package kominfo.go.id.storage.final_project;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.edt_username);
        password = findViewById(R.id.edt_password);
    }

    public void proses_login(View v){
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(LoginActivity.this, "Username atau Password Salah!", Toast.LENGTH_LONG).show();
        }
    }

    public void proses_keluar(View v){
        finish();
    }
}

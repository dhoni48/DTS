package kominfo.go.id.storage.pertemuan10a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void Internal(View v){
        Intent intent = new Intent(MainActivity.this, InternalActivity.class);
        startActivity(intent);
    }

    public  void External(View v){
        Intent intent = new Intent(MainActivity.this, ExternalActivity.class);
        startActivity(intent);
    }
}

package kominfo.go.id.storage.pertemuan15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.menu1){
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        }else if(item.getItemId()==R.id.menu2){
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        }else if(item.getItemId()==R.id.menu3){
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
        return true;
    }
}

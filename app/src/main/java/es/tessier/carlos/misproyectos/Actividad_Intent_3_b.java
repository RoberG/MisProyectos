package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Actividad_Intent_3_b extends Activity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__intent_3_b);

        Toast.makeText(this, getIntent().getStringExtra("str1"),Toast.LENGTH_SHORT).show();
        Toast.makeText(this,  Integer.toString(getIntent().getIntExtra("num1", 404)),Toast.LENGTH_SHORT).show();

        Bundle bundle = getIntent().getExtras();
        Toast.makeText(this, bundle.getString("str2"),Toast.LENGTH_SHORT).show();
        Toast.makeText(this, Integer.toString(bundle.getInt("num2", 404)),Toast.LENGTH_SHORT).show();
    }


    public void mandarDatos(View view)
    {
        intent = new Intent();
        intent.setData(Uri.parse("Esto es el tercer string"));
        intent.putExtra("num3",45);
        setResult(Activity.RESULT_OK,intent);
        finish();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad__intent_3_b, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

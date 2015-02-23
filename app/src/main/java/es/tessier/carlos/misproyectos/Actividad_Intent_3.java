package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Actividad_Intent_3 extends Activity {

    static final int codigo = 1;  // The request code
    Intent intent;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__intent_3);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == codigo) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, data.getData().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(this,  Integer.toString(data.getIntExtra("num3",404)),Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void actividad3_b(View boton)
    {
        intent = new Intent(this,Actividad_Intent_3_b.class);

        intent.putExtra("str1","Esto es un string");
        intent.putExtra("num1",25);

        bundle = new Bundle();
        bundle.putString("str2","Esto es otro string");
        bundle.putInt("num2",35);
        intent.putExtras(bundle);


        startActivityForResult(intent,codigo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad__intent_3, menu);
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

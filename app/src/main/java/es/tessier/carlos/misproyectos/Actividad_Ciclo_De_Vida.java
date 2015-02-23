package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class Actividad_Ciclo_De_Vida extends Activity {

    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_de_vida);
        Toast.makeText(this, TAG+": onCreate",Toast.LENGTH_LONG).show();
        Log.i(TAG, "onCreate");
    }

    @Override
    public void onRestart()
    {
        Toast.makeText(this, TAG+": onRestart",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onRestart");
        super.onRestart();
    }

    @Override
    public void onResume()
    {
        Toast.makeText(this, TAG+": onResume",Toast.LENGTH_LONG).show();
        Log.i(TAG, "onResume");
        super.onResume();
    }

    @Override
    public void onPause()
    {
        Toast.makeText(this, TAG+": onPause",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onPause");
        super.onPause();
    }

    @Override
    public void onStop()
    {
        Toast.makeText(this, TAG+": onStop",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onStop");
        super.onStop();
    }

    @Override
    public void onDestroy()
    {
        Toast.makeText(this, TAG+": onDestroy",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onDestroy");
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ciclo_de_vida, menu);
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

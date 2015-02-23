package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Actividad_Implicit_Intents extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_implicit_intents, menu);
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


    public void onClickWebBrowser(View v)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http:/www.centroafuera.es/")));

        /*
        Permiso en AndroidManifest:
        <uses-permission android:name="android.permission.INTERNET" />
         */
    }


    public void onClickShowDial(View v)
    {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:914295151")));

        /*
        Permiso en AndroidManifest:
        <uses-permission android:name="android.permission.CALL_PHONE"/>
         */
    }

    public void onClickShowMap(View v)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/Centro+de+Estudios+Afuera/@40.4129077,-3.7035046,17z/data=!4m2!3m1!1s0x0:0xd47b8dd7563d8346")));

        /*
        Permiso en AndroidManifest:
        <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
         */
    }

}

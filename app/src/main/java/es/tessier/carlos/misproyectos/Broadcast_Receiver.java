package es.tessier.carlos.misproyectos;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Broadcast_Receiver extends BroadcastReceiver {
    public Broadcast_Receiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Intent Recibido: "+intent.getAction().toString()+"\n"+"Mensaje: "+intent.getStringExtra("Texto"), Toast.LENGTH_SHORT).show();
    }
}

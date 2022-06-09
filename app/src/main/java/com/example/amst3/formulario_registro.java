package com.example.amst3;

import android.app.NotificationManager; import
        android.app.NotificationChannel; import
        android.app.PendingIntent; import
        android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat; import
        android.support.v7.app.AppCompatActivity; import
        android.view.View;
public class formulario_registro extends AppCompatActivity { @Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_formulario_registro);
}
    //insertarpaciente
    public void insertarpaciente(View v) {
        addNotification();
    }
    private void addNotification() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            String id ="canal";
            String description = "AMST";
            int importance = NotificationManager.IMPORTANCE_HIGH; NotificationChannel
                    channel = new NotificationChannel(id,
                    description, importance);
            NotificationCompat.Builder builder =
                    new NotificationCompat.Builder(this,id)
                            .setSmallIcon(R.drawable.aa).setContentTitle("Se ha registrado con exito")
                            .setContentText("Revise su correo electronico en los proximos 2 dias")
                                            .setAutoCancel(true)
                                            .setPriority(NotificationCompat.PRIORITY_DEFAULT);
            Intent notificationIntent = new Intent(this,
                    formulario_registro.class);
            notificationIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            notificationIntent.putExtra("message", "This is a notification message");
                    PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                            PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(pendingIntent); NotificationManager manager =
                    (NotificationManager)
                            getSystemService(Context.NOTIFICATION_SERVICE);
            manager.createNotificationChannel(channel);
            manager.notify(0, builder.build());
        }}
}
package com.example.atul.notification;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    NotificationManager notificationManager;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder nb = new NotificationCompat.Builder(getApplicationContext());
                nb.setContentTitle("New Booking");
                nb.setContentText("Booking id 3");
                nb.setSubText("Riding with driver1 ");
                nb.setSmallIcon(R.mipmap.ic_launcher);
                notificationManager.notify(2, nb.build());

            }
        });

    }
}

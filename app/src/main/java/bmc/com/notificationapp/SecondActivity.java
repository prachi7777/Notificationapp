package bmc.com.notificationapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Button btn_notify=(Button)findViewById(R.id.notify);
        btn_notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Intent intent=new Intent(SecondActivity.this,SecondActivity.class);
                //  PendingIntent pendingIntent=PendingIntent.getActivity(SecondActivity.this,0,intent,0);

                Intent intent1=new Intent(SecondActivity.this,MainActivity.class);
                PendingIntent pendingIntent1=PendingIntent.getActivity(SecondActivity.this,0,intent1,0);

                Notification notification=new Notification.Builder(SecondActivity.this)
                        .setTicker("Ticker")
                        .setContentTitle("second notification title")
                        .setContentText("second notification Text")
                        .setSmallIcon(R.drawable.first)
                        // .addAction(R.mipmap.ic_launcher_round,"action 1",pendingIntent1)
                        .setContentIntent(pendingIntent1).getNotification();

                //notification.flags=Notification.FLAG_AUTO_CANCEL;

                notification.flags= Notification.FLAG_NO_CLEAR;
                NotificationManager nManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                nManager.notify(0,notification);





            }







        });

    }
}

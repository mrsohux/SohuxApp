package sohel.shaikh.sohuxapp;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    Thread timer;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.giffy);
        Glide.with(this).load(R.drawable.mrdude).into(imageView);

        timer=new Thread()
        {
            public void run()
            {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent_my=new Intent(getApplicationContext(),Login.class);
                    startActivity(intent_my);
                }
            }
        };
        timer.start();
    }
}
package com.aborteddeveloperse.skascfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;

import android.widget.VideoView;


public class SplashActivity extends AppCompatActivity {

    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        getSupportActionBar().hide();
        videoView = (VideoView)findViewById(R.id.videoView2);
        Uri video =Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.eeee);

        videoView.setVideoURI(video);

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (isFinishing())
                    return;


                startActivity(new Intent(SplashActivity.this,LoginActivity.class));
                finish();
            }
        });
        videoView.start();


    }
}

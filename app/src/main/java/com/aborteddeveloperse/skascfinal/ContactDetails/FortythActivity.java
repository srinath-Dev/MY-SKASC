package com.aborteddeveloperse.skascfinal.ContactDetails;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aborteddeveloperse.skascfinal.R;

public class FortythActivity extends AppCompatActivity {
    Button a;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_fortyth);
        a=findViewById (R.id.kri);
        a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-979-144-5953"));
                if (ActivityCompat.checkSelfPermission (FortythActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        b=findViewById (R.id.ksri);
        b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-915-072-3478"));
                if (ActivityCompat.checkSelfPermission (FortythActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
    }
}

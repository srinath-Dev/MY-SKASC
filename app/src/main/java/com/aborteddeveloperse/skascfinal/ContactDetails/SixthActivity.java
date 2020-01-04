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

public class SixthActivity extends AppCompatActivity {
    Button a;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sixth);
        a=findViewById (R.id.button41);
        a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-978-760-1960"));
                if (ActivityCompat.checkSelfPermission (SixthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        b=findViewById (R.id.button40);
        b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"swarnalthak@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });

    }
}

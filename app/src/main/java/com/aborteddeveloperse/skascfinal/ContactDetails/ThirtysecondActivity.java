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

public class ThirtysecondActivity extends AppCompatActivity {
    Button a;
    Button b;
    Button c;
    Button d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_thirtysecond);
        a=findViewById (R.id.kri);
        a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-892-546-0115"));
                if (ActivityCompat.checkSelfPermission (ThirtysecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        b=findViewById (R.id.buttonnm);
        b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-967-735-9366"));
                if (ActivityCompat.checkSelfPermission (ThirtysecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        c=findViewById (R.id.buttonbgd);
        c.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-744-833-9449"));
                if (ActivityCompat.checkSelfPermission (ThirtysecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        d=findViewById (R.id.buttondabgd);
        d.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-733-901-2299"));
                if (ActivityCompat.checkSelfPermission (ThirtysecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });

    }
}

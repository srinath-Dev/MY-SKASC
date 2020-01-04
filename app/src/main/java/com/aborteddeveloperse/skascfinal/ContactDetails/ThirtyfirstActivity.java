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

public class ThirtyfirstActivity extends AppCompatActivity {
    Button a;
    Button b;
    Button c;
    Button d;
    Button e;
    Button f;
    Button g;
    Button h;
    Button i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_thirtyfirst);
        a=findViewById (R.id.hc1);
        a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-950-044-8840"));
                if (ActivityCompat.checkSelfPermission (ThirtyfirstActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        b=findViewById (R.id.pc1);
        b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-709-497-5782"));
                if (ActivityCompat.checkSelfPermission (ThirtyfirstActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        c=findViewById (R.id.kc1);
        c.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-979-174-3868"));
                if (ActivityCompat.checkSelfPermission (ThirtyfirstActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        d=findViewById (R.id.kc2);
        d.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-989-427-3383"));
                if (ActivityCompat.checkSelfPermission (ThirtyfirstActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        e=findViewById (R.id.dc1);
        e.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-999-473-4569"));
                if (ActivityCompat.checkSelfPermission (ThirtyfirstActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        f=findViewById (R.id.sc1);
        f.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-989-483-3124"));
                if (ActivityCompat.checkSelfPermission (ThirtyfirstActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        g=findViewById (R.id.kc3);
        g.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-959-772-3823"));
                if (ActivityCompat.checkSelfPermission (ThirtyfirstActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        h=findViewById (R.id.vc1);
        h.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-948-995-2526"));
                if (ActivityCompat.checkSelfPermission (ThirtyfirstActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        i=findViewById (R.id.vcs1);
        i.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-811-005-4505"));
                if (ActivityCompat.checkSelfPermission (ThirtyfirstActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
    }
}

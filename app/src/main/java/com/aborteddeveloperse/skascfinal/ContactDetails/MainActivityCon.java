package com.aborteddeveloperse.skascfinal.ContactDetails;
import android.Manifest;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.aborteddeveloperse.skascfinal.R;

public class MainActivityCon extends AppCompatActivity {
    Button a;
    Button b;
    Button c;
    Button e;
    Button f;
    Button g;
    Button h;
    Button i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        a=findViewById (R.id.button);
        a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-978-660-7000"));
                if (ActivityCompat.checkSelfPermission (MainActivityCon.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        e=findViewById (R.id.button8);
        e.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"ceo@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });

        b=findViewById (R.id.button5);
        b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-989-410-0186"));
                if (ActivityCompat.checkSelfPermission (com.aborteddeveloperse.skascfinal.ContactDetails.MainActivityCon.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        f=findViewById (R.id.button6);
        f.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] a= {"principal@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,a);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });

        c=findViewById (R.id.button7);
        c.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:91-986-594-3665"));
                if (ActivityCompat.checkSelfPermission (MainActivityCon.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        g=findViewById (R.id.button4);
        g.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] to= {"vijayasamundeswarir@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,to);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });

        h=findViewById (R.id.button9);
        h.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MainActivityCon.this, SecondActivity.class);
                startActivity (i);
            }
        });
        i=findViewById (R.id.button10);
        i.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent ia = new Intent (MainActivityCon.this, ThirdActivity.class);
                startActivity (ia);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater ().inflate (R.menu.men, menu);
        return super.onCreateOptionsMenu (menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId ()) {
            case R.id.id1:
            Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
            String[] a= {"anandking9944@gmail.com"};
            email.putExtra (Intent.EXTRA_EMAIL,a);
            email.putExtra (Intent.EXTRA_SUBJECT," ");
            email.putExtra (Intent.EXTRA_TEXT," ");
            email.setType ("message/rfc822");
            startActivity (Intent.createChooser (email,"Send Email Via"));
        }
        return super.onOptionsItemSelected (item);
    }
}

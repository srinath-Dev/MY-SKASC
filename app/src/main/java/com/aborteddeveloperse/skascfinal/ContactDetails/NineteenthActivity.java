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

public class NineteenthActivity extends AppCompatActivity {
    Button a;
    Button b;
    Button c;
    Button d;
    Button e;
    Button f;
    Button g;
    Button h;
    Button i;
    Button j;
    Button k;
    Button l;
    Button m;
    Button n;
    Button o;
    Button p;
    Button q;
    Button r;
    Button s;
    Button t;
    Button u;
    Button v;
    Button w;
    Button x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_nineteenth);
        a=findViewById (R.id.hc1);
        a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-984-354-1855"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        b=findViewById (R.id.hm1);
        b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"sumathin@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        c=findViewById (R.id.pc1);
        c.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-770-856-7416"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        d=findViewById (R.id.pm1);
        d.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"kowsalyas@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        e=findViewById (R.id.kc1);
        e.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-978-892-3575"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        f=findViewById (R.id.km1);
        f.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"sivakumarn@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        g=findViewById (R.id.kc2);
        g.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-875-491-0125"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        h=findViewById (R.id.km2);
        h.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"nalinik@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        i=findViewById (R.id.dc1);
        i.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-994-761-1164"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        j=findViewById (R.id.dm1);
        j.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"ancysimina@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        k=findViewById (R.id.sc1);
        k.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-997-663-8358"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        l=findViewById (R.id.sm1);
        l.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"balajis@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        m=findViewById (R.id.kc3);
        m.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-999-424-1342"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        n=findViewById (R.id.km3);
        n.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"devikalyanis@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        o=findViewById (R.id.vc1);
        o.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-959-706-5656"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        p=findViewById (R.id.vm1);
        p.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"sindhus@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        q=findViewById (R.id.mmc);
        q.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-848-995-9929"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        r=findViewById (R.id.mmm);
        r.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"maadhinia@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        s=findViewById (R.id.rnc1);
        s.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-959-703-1365"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        t=findViewById (R.id.rnm1);
        t.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"sudhas@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        u=findViewById (R.id.kic1);
        u.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-997-693-5241"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        v=findViewById (R.id.kim1);
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"shanmugavadiveld@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        w=findViewById (R.id.rrc1);
        w.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-997-635-3650"));
                if (ActivityCompat.checkSelfPermission (NineteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        x=findViewById (R.id.rrm1);
        x.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"saravanant@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
    }
}

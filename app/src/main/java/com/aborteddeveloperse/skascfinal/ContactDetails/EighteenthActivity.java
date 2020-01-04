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

public class EighteenthActivity extends AppCompatActivity {
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
    Button wa;
    Button xa;
    Button y;
    Button z;
    Button a1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_eighteenth);
        a=findViewById (R.id.hc1);
        a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-999-441-6464"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"anbumalars@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-984-261-6930"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"maheswarcr@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-790-488-2398"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"subhas@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-787-180-9789"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"sivabagyamkr@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-995-282-5779"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"vanithamanip@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-989-452-1514"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"nithyapriyam@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-739-755-5866"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"aardhrav@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-950-033-7576"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"gayathiridevic@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-808-960-6403"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"chandradevip@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-909-546-2694"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"swapnanambiar@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-904-268-2462"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"aarthijonei@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-978-979-6458"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"murugans@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        wa=findViewById (R.id.ppc1);
        wa.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-948-619-2081"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        xa=findViewById (R.id.ppm);
        xa.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"balakrishnanc@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        y=findViewById (R.id.brc1);
        y.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-994-465-0054"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        z=findViewById (R.id.brn1);
        z.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"mahadevir@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
        a1=findViewById (R.id.rac1);
        a1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-756-105-7133"));
                if (ActivityCompat.checkSelfPermission (EighteenthActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity (intent);
            }
        });
        b1=findViewById (R.id.ram1);
        b1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent email = new Intent (Intent.ACTION_SEND, Uri.parse ("mailto:"));
                String[] h= {"sruthib@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });
    }
}

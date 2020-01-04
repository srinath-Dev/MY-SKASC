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

public class EleventhActivity extends AppCompatActivity {
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
    Button y;
    Button z;
    Button wa;
    Button xa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_eleventh);
        a=findViewById (R.id.hc1);
        a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+91-944-255-4360"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"jeenMarselineks@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-994-463-6200"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"shobanad@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-944-229-0887"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"deepab@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-999-414-6982"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"suchitrab@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-807-208-1885"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"valarmathiv@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-959-786-1023"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"kavithasct@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-984-071-6119"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"logeshwaria@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-962-937-4333"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"vetrivels@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-938-477-3841"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"abarnag@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-805-635-5820"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"suriyam@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-877-881-4013"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"rameshkumarb@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-900-336-8167"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"suthak@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-978-952-3496"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"jayachandrana@skasc.ac.in"};
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
                intent.setData (Uri.parse ("tel:+91-984-290-8585"));
                if (ActivityCompat.checkSelfPermission (EleventhActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
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
                String[] h= {"radhab@skasc.ac.in"};
                email.putExtra (Intent.EXTRA_EMAIL,h);
                email.putExtra (Intent.EXTRA_SUBJECT," ");
                email.putExtra (Intent.EXTRA_TEXT," ");
                email.setType ("message/rfc822");
                startActivity (Intent.createChooser (email,"Send Email Via"));
            }
        });

    }
}

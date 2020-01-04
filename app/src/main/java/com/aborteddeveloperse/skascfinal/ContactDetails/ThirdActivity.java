package com.aborteddeveloperse.skascfinal.ContactDetails;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aborteddeveloperse.skascfinal.R;

public class ThirdActivity extends AppCompatActivity {
    Button o;
    Button f;
    Button h;
    Button e;
    Button ms;
    Button cs;
    Button csa;
    Button it;
    Button ct;
    Button bca;
    Button ecs;
    Button cdf;
    Button ch;
    Button bs;
    Button com;
    Button ca;
    Button af;
    Button bps;
    Button man;
    Button comi;
    Button psy;
    Button ba;
    Button msw;
    Button tou;
    Button phys;
    Button pub;
    Button li;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_third);
        o=findViewById (R.id.button16);
        o.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,FourthActivity.class);
                startActivity (i);
            }
        });
        f=findViewById (R.id.button3);
        f.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,FifthActivity.class);
                startActivity (i);
            }
        });
        h=findViewById (R.id.button11);
        h.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,SixthActivity.class);
                startActivity (i);
            }
        });
        e=findViewById (R.id.button12);
        e.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,SeventhActivity.class);
                startActivity (i);
            }
        });
        ms=findViewById (R.id.button13);
        ms.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,EighthActivity.class);
                startActivity (i);
            }
        });
        cs=findViewById (R.id.button14);
        cs.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,NinthActivity.class);
                startActivity (i);
            }
        });
        csa=findViewById (R.id.button15);
        csa.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TenthActivity.class);
                startActivity (i);
            }
        });
        it=findViewById (R.id.button17);
        it.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,EleventhActivity.class);
                startActivity (i);
            }
        });
        ct=findViewById (R.id.button18);
        ct.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwelvethActivity.class);
                startActivity (i);
            }
        });
        bca=findViewById (R.id.button19);
        bca.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, ThirteenthActivity.class);
                startActivity (i);
            }
        });
        ecs=findViewById (R.id.button20);
        ecs.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,ForteenthActivity.class);
                startActivity (i);
            }
        });
        cdf=findViewById (R.id.button21);
        cdf.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,FifteenthActivity.class);
                startActivity (i);
            }
        });
        ch=findViewById (R.id.button30);
        ch.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,SixteenthActivity.class);
                startActivity (i);
            }
        });
        bs=findViewById (R.id.button33);
        bs.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,SeventeenthActivity.class);
                startActivity (i);
            }
        });
        com=findViewById (R.id.button31);
        com.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,EighteenthActivity.class);
                startActivity (i);
            }
        });
        ca=findViewById (R.id.button22);
        ca.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,NineteenthActivity.class);
                startActivity (i);
            }
        });
        af=findViewById (R.id.button23);
        af.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwentythActivity.class);
                startActivity (i);
            }
        });
        bps=findViewById (R.id.button24);
        bps.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this,TwentyfirstActivity.class);
                startActivity (i);
            }
        });
        man=findViewById (R.id.button26);
        man.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwentysecondActivity.class);
                startActivity (i);
            }
        });
        comi=findViewById (R.id.button25);
        comi.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwentythirdActivity.class);
                startActivity (i);
            }
        });
        psy=findViewById (R.id.button28);
        psy.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwentyfourthActivity.class);
                startActivity (i);
            }
        });
        ba=findViewById (R.id.button27);
        ba.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwentyfifthActivity.class);
                startActivity (i);
            }
        });
        msw=findViewById (R.id.button36);
        msw.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwentysixthActivity.class);
                startActivity (i);
            }
        });
        tou=findViewById (R.id.button29);
        tou.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwentyseventhActivity.class);
                startActivity (i);
            }
        });
        phys=findViewById (R.id.button34);
        phys.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwentyeighthActivity.class);
                startActivity (i);
            }
        });
        pub=findViewById (R.id.button32);
        pub.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, TwentyninthActivity.class);
                startActivity (i);
            }
        });
        li=findViewById (R.id.button35);
        li.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (ThirdActivity.this, ThirtythActivity.class);
                startActivity (i);
            }
        });



    }
}

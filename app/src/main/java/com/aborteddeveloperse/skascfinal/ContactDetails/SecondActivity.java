package com.aborteddeveloperse.skascfinal.ContactDetails;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aborteddeveloperse.skascfinal.R;

public class SecondActivity extends AppCompatActivity {
    Button of;
    Button coe;
    Button lib;
    Button labcs;
    Button labcdf;
    Button ecs;
    Button bio;
    Button mb;
    Button at;
    Button att;
    Button chs;
    Button plum;
    Button swe;
    Button sca;
    Button au;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second);
        of=findViewById (R.id.button16);
        of.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this, ThirtyfirstActivity.class);
                startActivity (i);
            }
        });
        coe=findViewById (R.id.button3);
        coe.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,ThirtysecondActivity.class);
                startActivity (i);
            }
        });
        lib=findViewById (R.id.button11);
        lib.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this, ThirtythirdActivity.class);
                startActivity (i);
            }
        });
        labcs=findViewById (R.id.button12);
        labcs.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this, ThirtyfourthActivity.class);
                startActivity (i);
            }
        });
        labcdf=findViewById (R.id.button13);
        labcdf.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this, ThirtyfifthActivity.class);
                startActivity (i);
            }
        });
        ecs=findViewById (R.id.button14);
        ecs.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,ThirtysixthActivity.class);
                startActivity (i);
            }
        });
        bio=findViewById (R.id.button15);
        bio.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this, ThirtyseventhActivity.class);
                startActivity (i);
            }
        });
        mb=findViewById (R.id.button17);
        mb.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,ThirtyeighthActivity.class);
                startActivity (i);
            }
        });
        at=findViewById (R.id.button18);
        at.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,ThirtyninthActivity.class);
                startActivity (i);
            }
        });
        att=findViewById (R.id.button19);
        att.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,FortythActivity.class);
                startActivity (i);
            }
        });
        chs=findViewById (R.id.button20);
        chs.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,FortyfirstActivity.class);
                startActivity (i);
            }
        });
        plum=findViewById (R.id.button21);
        plum.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,FortysecondActivity.class);
                startActivity (i);
            }
        });
        swe=findViewById (R.id.button38);
        swe.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,FortythirdActivity.class);
                startActivity (i);
            }
        });
        sca=findViewById (R.id.button39);
        sca.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,FortyfourthActivity.class);
                startActivity (i);
            }
        });
        au=findViewById (R.id.button42);
        au.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (SecondActivity.this,Fortyfifth.class);
                startActivity (i);
            }
        });

    }
}

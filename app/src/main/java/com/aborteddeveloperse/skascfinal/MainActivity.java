package com.aborteddeveloperse.skascfinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.aborteddeveloperse.skascfinal.Fragment.AcademicsFragment;
import com.aborteddeveloperse.skascfinal.Fragment.EbookFragment;
import com.aborteddeveloperse.skascfinal.Fragment.EventFragment;
import com.aborteddeveloperse.skascfinal.Fragment.HomeFragment;
import com.aborteddeveloperse.skascfinal.Fragment.ProfileFragment;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){
                        case R.id.navi_home:
                            selectedFragment = new HomeFragment();
                            break;

                        case R.id.navi_event:
                            selectedFragment = new EventFragment();

                            break;

                        case R.id.navi_acadamics:
                            selectedFragment = new AcademicsFragment();


                            break;

                        case R.id.navi_profile:
                            selectedFragment = new ProfileFragment();

                            break;

                        case R.id.navi_ebook:

                            selectedFragment = new EbookFragment();

                            break;
                    }

                    if (selectedFragment != null){
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedFragment).commit();
                    }
                    return true;
                }
            };
}

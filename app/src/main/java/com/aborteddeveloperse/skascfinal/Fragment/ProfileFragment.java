package com.aborteddeveloperse.skascfinal.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.aborteddeveloperse.skascfinal.ContactDetails.MainActivityCon;
import com.aborteddeveloperse.skascfinal.EditProfileActivity;
import com.aborteddeveloperse.skascfinal.R;

public class ProfileFragment extends Fragment {

    Button profileButt , conButt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        profileButt = view.findViewById(R.id.butProfile);
        conButt = view.findViewById(R.id.butContact);

        profileButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (getContext (), EditProfileActivity.class));
            }
        });

        conButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (getContext (), MainActivityCon.class));
            }
        });






        return view;
    }

}

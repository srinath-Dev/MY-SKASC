package com.aborteddeveloperse.skascfinal.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.aborteddeveloperse.skascfinal.ExamWebActivity;
import com.aborteddeveloperse.skascfinal.GoogleWebActivity;
import com.aborteddeveloperse.skascfinal.KlassWebActivity;
import com.aborteddeveloperse.skascfinal.R;
import com.aborteddeveloperse.skascfinal.WebsiteWebActivity;


public class AcademicsFragment extends Fragment {

    ImageButton buttonGoogle;
    ImageButton buttonKlass;
    ImageButton buttonExam;
    ImageButton buttonWeb;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_academics, container, false);

        buttonGoogle = view. findViewById(R.id.ButtonClass);
        buttonKlass = view.findViewById(R.id.ButtonMy);
        buttonExam = view.findViewById(R.id.ButtonExam);
        buttonWeb = view.findViewById(R.id.ButtonWeb);

        buttonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(getContext (), GoogleWebActivity.class));
            }
        });
        buttonKlass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (getContext (), KlassWebActivity.class));
            }
        });
        buttonExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (getContext (), ExamWebActivity.class));
            }
        });
        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (getContext (), WebsiteWebActivity.class));
            }
        });









        return view;
    }


}

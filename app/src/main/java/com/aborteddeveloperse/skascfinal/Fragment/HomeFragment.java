package com.aborteddeveloperse.skascfinal.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.aborteddeveloperse.skascfinal.Post;
import com.aborteddeveloperse.skascfinal.PostActivity;
import com.aborteddeveloperse.skascfinal.PostAdapter;
import com.aborteddeveloperse.skascfinal.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;



public class HomeFragment extends Fragment {

    Button postButton;
    private RecyclerView recyclerView;
    private PostAdapter postAdapter;
    private List<Post> postLists;
    private ImageView imageView;


    ProgressBar progressBar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        postButton = view.findViewById(R.id.postButt);

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (getContext (), PostActivity.class));
            }
        });

        recyclerView = view.findViewById (R.id.recycler_view);

        recyclerView.setHasFixedSize (true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager (getContext ());
        linearLayoutManager.setReverseLayout (true);
        linearLayoutManager.setStackFromEnd (true);
        recyclerView.setLayoutManager (linearLayoutManager);

        postLists = new ArrayList<> ();
        postAdapter = new PostAdapter (getContext (),postLists);
        recyclerView.setAdapter (postAdapter);




        progressBar = view.findViewById (R.id.progress_circular);

        readPosts ();




        return view;

    }


    private void readPosts (){
        DatabaseReference reference = FirebaseDatabase.getInstance ().getReference ("Posts");

        reference.addValueEventListener (new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                postLists.clear ();
                for (DataSnapshot snapshot : dataSnapshot.getChildren ()){

                    Post post = snapshot.getValue (Post.class);

                            postLists.add (post);

                }

                postAdapter.notifyDataSetChanged ();




            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


}

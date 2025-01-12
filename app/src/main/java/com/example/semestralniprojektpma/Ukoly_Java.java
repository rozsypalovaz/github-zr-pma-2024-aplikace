package com.example.semestralniprojektpma;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Ukoly_Java extends AppCompatActivity {

RecyclerView recyclerView;
MainAdapter mainAdapter;

protected void onCreate(Bundle savedInstanceState ) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.ukoly);

    recyclerView = (RecyclerView)findViewById(R.id.rv);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));

    FirebaseRecyclerOptions<MainModel> options =
            new FirebaseRecyclerOptions.Builder<MainModel>()
                    .setQuery(FirebaseDatabase.getInstance().getReference().child("vyzvy"), MainModel.class)
                    .build();

    mainAdapter = new MainAdapter(options);
    recyclerView.setAdapter(mainAdapter);

}

    @Override
    protected void onStart() {
        super.onStart();
        mainAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapter.stopListening();
    }
}





package com.example.cheyenne.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addTopic extends AppCompatActivity {
    //private Button button;
    //FirebaseDatabase database;
    //DatabaseReference myRef;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_topic);

        /*database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Topics");

        button = findViewById(R.id.topicFinish);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = "ICS 45J";
                String key = myRef.push().getKey();
                myRef.child(key).setValue(title);
                //openAddCard(view);
            }
        });
        */
    }
    public void openAddCard(View view)
    {
        startActivity(new Intent(this, addCard.class));
    }

}

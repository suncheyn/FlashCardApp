package com.example.cheyenne.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.*;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addTopic extends AppCompatActivity {
    private Button button;
    private EditText topicField;
    private String topicName;
    private Topics t;
    FirebaseDatabase database;
    DatabaseReference myRef;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_topic);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Topics");

        button = findViewById(R.id.topicFinish);
        topicField = findViewById(R.id.newTopic);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topicName = topicField.getText().toString();
                String key = myRef.push().getKey(); //warning: may be null
                t = new Topics(topicName, key);
                myRef.child(key).setValue(t);
                openAddCard();
            }
        });
        topicField.setText("");
    }
    public void openAddCard()
    {
        Intent intent = new Intent(this, addCard.class);
        intent.putExtra("Topic", t.getTitle());
        startActivity(intent);
    }

}

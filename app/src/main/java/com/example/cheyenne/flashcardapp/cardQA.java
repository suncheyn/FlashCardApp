//Cheyenne Chavez cheyenmc 92973249

package com.example.cheyenne.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DataSnapshot;

public class cardQA extends AppCompatActivity {
    private Button editButton;
    private Button removeButton;
    private TextView questionField;
    private EditText questionText;
    private TextView answerField;
    private EditText answerText;
    private Button backButton;

    private ChildEventListener childEventListener;
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_q);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("FlashCards");

        childEventListener = new ChildEventListener() {
            @Override

            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                questionField = findViewById(R.id.cardQuestionField);
                answerField = findViewById(R.id.cardAnswerField);
                questionField.setText(dataSnapshot.child("question").getValue().toString());
                answerField.setText(dataSnapshot.child("answer").getValue().toString());
                editButton = findViewById(R.id.buttonEdit);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                questionField = findViewById(R.id.cardQuestionField);
                answerField = findViewById(R.id.cardAnswerField);
                questionField.setText(dataSnapshot.child("question").getValue(String.class));
                answerField.setText(dataSnapshot.child("answer").getValue(String.class));
                editButton = findViewById(R.id.buttonEdit);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        };
    }
    public void goBackToCardDisplay(View view)
    {
        startActivity(new Intent(this, cardDisplay.class));
    }
}

//Cheyenne Chavez cheyenmc 92973249

package com.example.cheyenne.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addCard extends AppCompatActivity {
    private Button button;
    private EditText questionField;
    private String questionText;
    private EditText answerField;
    private String answerText;
    private String topic;
    private FlashCard card;
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        Bundle bundle = getIntent().getExtras();
        topic = bundle.getString("Topic");

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("FlashCards");

        button = findViewById(R.id.cardFinish);
        questionField = findViewById(R.id.cardQuestion);
        answerField = findViewById(R.id.cardAnswer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionText = questionField.getText().toString();
                answerText = answerField.getText().toString();
                String key = myRef.push().getKey(); //warning: may be null
                FlashCard c = new FlashCard(topic, questionText, answerText);
                myRef.child(key).setValue(c);
                cardDisplayGo(v);
            }
        });




    }

    public void cardDisplayGo(View view) {
        questionField.setText("");
        answerField.setText("");
        startActivity(new Intent(this, cardDisplay.class));
    }


}

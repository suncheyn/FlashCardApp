package com.example.cheyenne.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addTopic extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_topic);

        button = findViewById(R.id.topicFinish);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddCard();
            }
        });
    }
    public void openAddCard()
    {
        Intent intent = new Intent(this, addCard.class);
        startActivity(intent);
    }
}

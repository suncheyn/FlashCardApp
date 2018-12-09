package com.example.cheyenne.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class addCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
    }

    public void cardDisplayGo(View view) {
        startActivity(new Intent(this, cardDisplay.class));
    }
}

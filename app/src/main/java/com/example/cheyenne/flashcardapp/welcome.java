//Cheyenne Chavez cheyenmc 92973249

package com.example.cheyenne.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = findViewById(R.id.newTopic);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddTopic();
            }
        });
    }
    public void openAddTopic()
    {
        Intent intent = new Intent(this, addTopic.class);
        startActivity(intent);
    }
}

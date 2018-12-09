package com.example.cheyenne.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class cardDisplay extends AppCompatActivity {

    //just for testing purposes:
    String items[] = new String [] {"What is Java?","Question 2","Question 3","How long can a a question be?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_display);

        //this line associates our ListView widget to the listView object in this file
        ListView listView = (ListView) findViewById(R.id.cardList);
        //...just for testing purposes
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //startActivity(new Intent(this, GroupCardsActivity.class));
            }
        });
    }

    public void addCardGo(View view){
        startActivity(new Intent(this, addCard.class));
    }

    public void actualMainGo(View view){
        startActivity(new Intent(this, actualMain.class));
    }
}

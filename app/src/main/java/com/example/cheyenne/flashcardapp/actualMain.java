package com.example.cheyenne.flashcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class actualMain extends AppCompatActivity {
    //just for testing purposes
    String items[] = new String [] {"ICS 45J","INF 121","INF 131","INF 151"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual_main);

        //this line associates our ListView widget to the listView object in this file
        ListView listView = (ListView) findViewById(R.id.topicList);
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

    public void newTopicCreateGo(View view) {
        startActivity(new Intent(this, addTopic.class));
    }
}

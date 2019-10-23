package com.example.garduinoandroid;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] labelListItems;
    Integer[] imageView={
            R.drawable.plant1,R.drawable.plant2,
            R.drawable.plant3,R.drawable.plant4,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelListItems = getResources().getStringArray(R.array.devicesArray);

        final MyListAdapter adapter = new MyListAdapter(this, labelListItems,imageView);
        listView = (ListView) findViewById(R.id.ListViewActivityMain);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if (position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(), "Place Your First Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {

                    Toast.makeText(getApplicationContext(), "Place Your Third Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {

                    Toast.makeText(getApplicationContext(), "Place Your Forth Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 4) {

                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

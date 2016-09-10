package com.example.anton.inventsendarraylistv2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    ListView listView=null;
//    final static String EXTRA_LIST = "list";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listView=(ListView)findViewById(R.id.listView);

    }
}

package com.example.anton.inventsendarraylistv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    ListView listView;
    Button button_1;
    final static String EXTRA_ARR = "arr";
    ArrayList<String> arrayList_1;
    String returnArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        arrayList_1=new ArrayList<>();
        listView=(ListView)findViewById(R.id.listView);
        button_1=(Button)findViewById(R.id.button_1);

        Intent intent=getIntent();
        arrayList_1=intent.getStringArrayListExtra(EXTRA_ARR);


        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList_1);
        listView.setAdapter(adapter);



    }

    @Override
    public void onClick(View arg0) {
    if(arg0.equals(button_1)){
        super.onBackPressed();
        //setContentView(R.layout.activity_main);
//        Intent intent=new Intent(this,MainActivity.class);
//        onPause();
//        this.startActivity(intent);
        return;
    }
    }
}

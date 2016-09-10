package com.example.anton.inventsendarraylistv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button button_0;
    ImageButton buttonPlus;
    LinkedList<String> linkedList;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkedList=new LinkedList<>();
        editText=(EditText)findViewById(R.id.editText);
        button_0=(Button)findViewById(R.id.button_0);
        buttonPlus=(ImageButton) findViewById(R.id.imageButton);
    }

    @Override
    public void onClick(View arg0) {
                value = editText.getText().toString();
    if (arg0.equals(button_0)) {
        if (value.length() != 0) {
            linkedList.addFirst(value);
            editText.setText("");

            DisplayToast(String.valueOf(linkedList));
        }

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(Main2Activity.EXTRA_ARR, linkedList);
        this.startActivity(intent);
        // return;
    }
        if (arg0.equals(buttonPlus)){
            Intent intent=new Intent(this,Main3Activity.class);
            this.startActivity(intent);
        }
    }

    private <Strg> String DisplayToast(String toast) {
        Toast.makeText(getBaseContext(), toast, Toast.LENGTH_LONG).show();
        return toast;
    }



}

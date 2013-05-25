package com.example.MyNewApp2;

import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.MenuItem;


public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    public final static String EXTRA_MESSAGE = "com.example.MyNewApp.MESSAGE";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        setContentView(R.layout.main);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void sendMessage(View view) {
        //Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);



    }
}


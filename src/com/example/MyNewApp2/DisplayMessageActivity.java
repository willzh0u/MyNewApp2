package com.example.MyNewApp2;

import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.widget.TextView;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.app.Activity;
import android.widget.EditText;





/**
 * Created with IntelliJ IDEA.
 * User: wzhou
 * Date: 5/13/13
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class DisplayMessageActivity extends MyActivity {

    @SuppressLint("NewApi")
    @Override


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Set the text view as the activity layout
        setContentView(textView);

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

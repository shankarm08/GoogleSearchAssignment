package com.example.shan.googlesearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static com.example.shan.googlesearch.R.id.editTextInput;

public class MainActivity extends Activity {



    private EditText editTextInput;
  //  EditText editTextInput = (EditText) findViewById(R.id.editTextInput);

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextInput = (EditText) findViewById(R.id.editTextInput);


    }

     public void onSearchClick(View v)
    {

        try {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            String term = editTextInput.getText().toString();
            intent.putExtra(SearchManager.QUERY, term);
            startActivity(intent);
        } catch (Exception e) {

            Log.e("check","");
            // TODO: handle exception
        }

    }
}
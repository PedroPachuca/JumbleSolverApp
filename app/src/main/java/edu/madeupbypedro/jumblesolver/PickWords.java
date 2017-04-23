package edu.madeupbypedro.jumblesolver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PickWords extends AppCompatActivity {

    private Button doneButton;
    private EditText numWordsTextField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_words);
    }
    private void setUpComponents() {
        doneButton = (Button) findViewById(R.id.doneButton);
        numWordsTextField = (EditText) findViewById(R.id.numWordsText);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numWords = Integer.parseInt(numWordsTextField.getText().toString());
                Intent myIntent = new Intent(CurrentActivity.this, NextActivity.class);
                
            }
        });

    }
}

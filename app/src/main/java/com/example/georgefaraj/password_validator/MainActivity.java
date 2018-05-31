package com.example.georgefaraj.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkPassword(View view) {
        TextView output = findViewById(R.id.responseText);
        EditText input = findViewById(R.id.editText);
        Validator v = new Validator();
        if(v.validate( input.getText().toString() ) )
            output.setText("Strong!");
        else
            output.setText("Not strong enough!");
    }

}

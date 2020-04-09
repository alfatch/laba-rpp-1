package com.amin.lw_01_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button _btn;
    TextView _twIn;
    EditText _etIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _btn    = (Button) findViewById(R.id.buttonId);
        _twIn   = (TextView) findViewById(R.id.textWiewId);
        _etIn   = (EditText) findViewById(R.id.editTextId);
        _btn.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.buttonId:
                _twIn.setText(_etIn.getText());
                break;
            default:
                break;
        }
    }

}

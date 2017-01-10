package com.example.johnny.a5_calculadoracheckb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2;
    CheckBox chkSuma, chkResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        chkSuma = (CheckBox) findViewById(R.id.ckbSuma);
        chkResta = (CheckBox) findViewById(R.id.chkResta);
    }

    public void operar(View view) {
        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());

        if (chkSuma.isChecked()) {
            Toast.makeText(getApplicationContext(),
                    "El resultado es " + (num1 + num2), Toast.LENGTH_SHORT)
                    .show();
        } else {
            if (chkResta.isChecked()) {
                Toast.makeText(getApplicationContext(),
                        "El resultado es " + (num1 - num2), Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }

}

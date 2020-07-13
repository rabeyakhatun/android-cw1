package com.example.cw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnh;
    TextView txtv;
    EditText edtx;
    TextView txth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnh=findViewById(R.id.btn);
        txtv=findViewById(R.id.txt);
        edtx=findViewById(R.id.edt);
        txth=findViewById(R.id.txthello);
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=edtx.getText().toString();
                txtv.setText(s);
                Toast.makeText(getApplicationContext(),"hi i am a student",Toast.LENGTH_LONG).show();

            }
        });
    }
}

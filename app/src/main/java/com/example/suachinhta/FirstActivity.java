package com.example.suachinhta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    EditText edta,edtkq;
    Button btnsend;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_first_activity);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        // Ánh xạ id cho biến giao diện;
        edta=findViewById(R.id.edta);
        edtkq=findViewById(R.id.edtkq);
        btnsend=findViewById(R.id.btnsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent(FirstActivity.this, com.example.suachinhta.SecondActivity.class);
                //lay du lieu tu nguoi dung nhap vao
                String a = edta.getText().toString();
                myintent.putExtra("text_data",a);
                startActivityForResult(myintent,99);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 99 && resultCode == 88 && data != null) {
            String correctedText = data.getStringExtra("corrected_text");
            edtkq.setText(correctedText);
        }
    }

}

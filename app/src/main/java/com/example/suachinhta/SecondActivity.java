package com.example.suachinhta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    EditText edtCorrect;
    Button btnDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtCorrect = findViewById(R.id.edtCorrect);
        btnDone = findViewById(R.id.btnDone);

        Intent intent = getIntent();
        String textData = intent.getStringExtra("text_data");
        edtCorrect.setText(textData);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correctedText = edtCorrect.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("corrected_text", correctedText);
                setResult(88, resultIntent); // Đặt resultCode thành 88
                finish();
            }
        });
    }
}
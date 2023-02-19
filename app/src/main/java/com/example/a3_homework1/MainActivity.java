package com.example.a3_homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button openBtn;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openBtn = findViewById(R.id.btn_open);
        editText = findViewById(R.id.edit_text);

       openBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("text", editText.getText().toString());
                startActivity(intent);
            }
        });
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType(Intent.EXTRA_MIME_TYPES);
        startActivity(intent);

        Intent intent1 = new Intent(Intent.ACTION_CALL);
    }
}
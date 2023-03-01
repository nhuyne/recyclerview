package com.example.buoi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView = findViewById(R.id.hellomsg);
        TextView detailText = findViewById(R.id.detail_text);

        Button btback=findViewById(R.id.btback);
        Intent intent = getIntent();
        String myItemText = intent.getStringExtra("item");
        Intent intent2 = getIntent();
        String myItemText2 = intent.getStringExtra("item2");

        detailText.setText(myItemText);
        textView.setText(myItemText2);

        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
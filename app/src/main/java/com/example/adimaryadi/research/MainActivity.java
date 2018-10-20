package com.example.adimaryadi.research;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            public static final String TAG = "Membuka Kamera";

            @Override
            public void onClick(View v) {
                Log.d(TAG, "mencoba");

            }
        });
    }


}

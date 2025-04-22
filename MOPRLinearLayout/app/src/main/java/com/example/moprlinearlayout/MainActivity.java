package com.example.moprlinearlayout;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private View layoutLeft, layoutRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutLeft  = findViewById(R.id.layout_left);
        layoutRight = findViewById(R.id.layout_right);

        findViewById(R.id.btnShowLeft).setOnClickListener(v -> {
            layoutLeft.setVisibility(View.VISIBLE);
            layoutRight.setVisibility(View.GONE);
        });

        findViewById(R.id.btnShowRight).setOnClickListener(v -> {
            layoutLeft.setVisibility(View.GONE);
            layoutRight.setVisibility(View.VISIBLE);
        });
    }
}

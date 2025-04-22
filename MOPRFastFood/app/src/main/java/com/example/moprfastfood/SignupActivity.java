package com.example.moprfastfood;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ImageButton btnSignup = findViewById(R.id.btn_signup);
        TextView    tvRecover = findViewById(R.id.tv_recover);

        btnSignup.setOnClickListener(v -> {
            // TODO: xử lý tạo tài khoản
        });

        tvRecover.setOnClickListener(v -> {
            // TODO: chuyển sang màn recovery password
        });
    }
}

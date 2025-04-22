package com.example.moprfastfood;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton btnLogin    = findViewById(R.id.btn_login);
        TextView    tvRegister  = findViewById(R.id.tv_register);

        btnLogin.setOnClickListener(v -> {
            // TODO: validate credentials...
            // Nếu hợp lệ, điều hướng sang MainActivity
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // tùy chọn: không cho quay lại màn login khi nhấn back
        });

        // Chuyển sang Signup
        tvRegister.setOnClickListener(v -> {
            startActivity(new Intent(this, SignupActivity.class));
        });
    }
}

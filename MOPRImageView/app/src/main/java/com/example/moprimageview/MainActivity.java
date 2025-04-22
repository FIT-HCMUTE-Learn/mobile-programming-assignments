package com.example.moprimageview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.example.moprimageview.utils.BackgroundUtils;

public class MainActivity extends AppCompatActivity {
    private ImageView backgroundImage;
    private Switch switchChangeBackground;
    private SwipeRefreshLayout swipeRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        backgroundImage = findViewById(R.id.backgroundImage);
        switchChangeBackground = findViewById(R.id.switchChangeBackground);
        swipeRefresh = findViewById(R.id.swipeRefresh);

        changeBackground();

        switchChangeBackground.setOnCheckedChangeListener((btn, isChecked) -> changeBackground());

        swipeRefresh.setOnRefreshListener(() -> {
            changeBackground();
            swipeRefresh.setRefreshing(false);
        });
    }

    private void changeBackground() {
        int randomImage = BackgroundUtils.getRandomBackground();
        backgroundImage.setImageResource(randomImage);
    }
}

package com.example.moprimageview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.moprimageview.utils.BackgroundUtils;

public class MainActivity extends AppCompatActivity {
    private ImageView backgroundImage;
    private Switch switchChangeBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Enable edge-to-edge display
        setContentView(R.layout.activity_main);

        // Apply edge-to-edge insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize UI components
        backgroundImage = findViewById(R.id.backgroundImage);
        switchChangeBackground = findViewById(R.id.switchChangeBackground);

        // Set a random background when the app loads
        changeBackground();

        // Change the background when the switch is toggled
        switchChangeBackground.setOnCheckedChangeListener((buttonView, isChecked) -> changeBackground());
    }

    // Function to change the background image randomly
    private void changeBackground() {
        int randomImage = BackgroundUtils.getRandomBackground();
        backgroundImage.setImageResource(randomImage);
    }
}

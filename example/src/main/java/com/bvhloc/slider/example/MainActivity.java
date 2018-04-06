package com.bvhloc.slider.example;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.bvhloc.slider.BvhSlider;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.welcome_text)).setText("Welcome 😁");

        findViewById(R.id.button_area_margin).setOnClickListener(this);
        findViewById(R.id.button_colors).setOnClickListener(this);
        findViewById(R.id.button_border_radius).setOnClickListener(this);
        findViewById(R.id.button_elevation).setOnClickListener(this);
        findViewById(R.id.button_text_size).setOnClickListener(this);
        findViewById(R.id.button_slider_dimension).setOnClickListener(this);
        findViewById(R.id.button_event_callbacks).setOnClickListener(this);
        findViewById(R.id.button_locked_slider).setOnClickListener(this);
        findViewById(R.id.button_custom_icon).setOnClickListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.reset) {
            ((BvhSlider) findViewById(R.id.welcome_slider)).resetSlider();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SampleActivity.class);
        intent.putExtra(SampleActivity.EXTRA_PRESSED_BUTTON, view.getId());
        startActivity(intent);
    }
}

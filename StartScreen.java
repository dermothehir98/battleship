package com.example.ul.battleship12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }

    public void onClickSearch(View view) {
            Intent intent1 = new Intent(StartScreen.this, HelloGridView.class);
            startActivity(intent1);
            finish();
        }
}

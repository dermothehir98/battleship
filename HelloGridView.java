package com.example.ul.battleship12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import static com.example.ul.battleship12.ImageAdapter.mThumbIds;

public class HelloGridView extends AppCompatActivity {
    boolean shipSelected = false;
    boolean ship5selected = false;
    boolean ship4selected = false;
    boolean ship3selected = false;
    boolean ship2selected = false;
    boolean ship1selected = false;
    View whichView;
    static int ship1Pos;
    static int ship2Pos;
    static int ship3Pos;
    static int ship4Pos;
    static int ship5Pos;
    boolean ship1Placed = false;
    boolean ship2Placed = false;
    boolean ship3Placed = false;
    boolean ship4Placed = false;
    boolean ship5Placed = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                if(position != 0 && position != 1 && position != 2 && position != 3 && position != 4 && position != 5 && position != 6 && position != 7 && position != 8 && position != 9 && position != 10 && position != 11 && position != 22 && position != 33 && position != 44 && position != 55 && position != 66 && position != 77 && position != 88 && position != 99 && position != 110 && position != ship1Pos && position != ship2Pos && position != ship3Pos && position != ship4Pos && position != ship5Pos) {
                    if (ship5selected == true) {
                        ship5selected = false;
                        mThumbIds[position] = R.drawable.ship1;
                        ship5Pos = position;
                        ship5Placed = true;
                    }
                    if (ship4selected == true) {
                        ship4selected = false;
                        mThumbIds[position] = R.drawable.ship1;
                        ship4Pos = position;
                        ship4Placed = true;
                    }
                    if (ship3selected == true) {
                        ship3selected = false;
                        mThumbIds[position] = R.drawable.ship1;
                        ship3Pos = position;
                        ship3Placed = true;
                    }
                    if (ship2selected == true) {
                        ship2selected = false;
                        mThumbIds[position] = R.drawable.ship1;
                        ship2Pos = position;
                        ship2Placed = true;
                    }
                    if (ship1selected == true) {
                        ship1selected = false;
                        mThumbIds[position] = R.drawable.ship1;
                        ship1Pos = position;
                        ship1Placed = true;
                    }
                    ImageView imageView = (ImageView) v;
                    imageView.setImageResource(ImageAdapter.mThumbIds[position]);


                    if (shipSelected == true) {
                        shipSelected = false;
                        whichView.setVisibility(View.GONE);
                    }
                }
            }
        });
    }

    public void onClickShip5(View view) {
        whichView = view;
        ship5selected = true;
        shipSelected = true;
        ship4selected = false;
        ship3selected = false;
        ship2selected = false;
        ship1selected = false;
    }
    public void onClickShip4(View view) {
        whichView = view;
        ship4selected = true;
        shipSelected = true;
        ship5selected = false;
        ship3selected = false;
        ship2selected = false;
        ship1selected = false;
    }
    public void onClickShip3(View view) {
        whichView = view;
        ship3selected = true;
        shipSelected = true;
        ship4selected = false;
        ship5selected = false;
        ship2selected = false;
        ship1selected = false;
    }
    public void onClickShip2(View view) {
        whichView = view;
        ship2selected = true;
        shipSelected = true;
        ship4selected = false;
        ship3selected = false;
        ship5selected = false;
        ship1selected = false;
    }
    public void onClickShip1(View view) {
        whichView = view;
        ship1selected = true;
        shipSelected = true;
        ship4selected = false;
        ship3selected = false;
        ship2selected = false;
        ship5selected = false;
    }

    public void onClickReady(View view) {
        if(ship1Placed == true && ship2Placed == true && ship3Placed == true && ship4Placed == true && ship5Placed == true ) {
            Intent intent1 = new Intent(HelloGridView.this, GridViewPlayer2.class);
            startActivity(intent1);
            finish();
        }
    }
}

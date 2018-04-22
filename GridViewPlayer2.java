package com.example.ul.battleship12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.ul.battleship12.ImageAdapterPlayer2.mThumbIdsP2;

public class GridViewPlayer2 extends AppCompatActivity {
    boolean shipSelectedP2 = false;
    boolean ship5selectedP2 = false;
    boolean ship4selectedP2 = false;
    boolean ship3selectedP2 = false;
    boolean ship2selectedP2 = false;
    boolean ship1selectedP2 = false;
    View whichViewP2;
    static int ship1PosP2;
    static int ship2PosP2;
    static int ship3PosP2;
    static int ship4PosP2;
    static int ship5PosP2;
    boolean ship1PlacedP2 = false;
    boolean ship2PlacedP2 = false;
    boolean ship3PlacedP2 = false;
    boolean ship4PlacedP2 = false;
    boolean ship5PlacedP2 = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.text);
        text.setText("Player 2 - Place Your Ships");

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapterPlayer2(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                if(position != 0 && position != 1 && position != 2 && position != 3 && position != 4 && position != 5 && position != 6 && position != 7 && position != 8 && position != 9 && position != 10 && position != 11 && position != 22 && position != 33 && position != 44 && position != 55 && position != 66 && position != 77 && position != 88 && position != 99 && position != 110 && position != ship1PosP2 && position != ship2PosP2 && position != ship3PosP2 && position != ship4PosP2 && position != ship5PosP2) {
                    if (ship5selectedP2 == true) {
                        ship5selectedP2 = false;
                        mThumbIdsP2[position] = R.drawable.ship1;
                        ship5PosP2 = position;
                        ship5PlacedP2 = true;
                    }
                    if (ship4selectedP2 == true) {
                        ship4selectedP2 = false;
                        mThumbIdsP2[position] = R.drawable.ship1;
                        ship4PosP2 = position;
                        ship4PlacedP2 = true;
                    }
                    if (ship3selectedP2 == true) {
                        ship3selectedP2 = false;
                        mThumbIdsP2[position] = R.drawable.ship1;
                        ship3PosP2 = position;
                        ship3PlacedP2 = true;
                    }
                    if (ship2selectedP2 == true) {
                        ship2selectedP2 = false;
                        mThumbIdsP2[position] = R.drawable.ship1;
                        ship2PosP2 = position;
                        ship2PlacedP2 = true;
                    }
                    if (ship1selectedP2 == true) {
                        ship1selectedP2 = false;
                        mThumbIdsP2[position] = R.drawable.ship1;
                        ship1PosP2 = position;
                        ship1PlacedP2 = true;
                    }
                    ImageView imageView = (ImageView) v;
                    imageView.setImageResource(ImageAdapterPlayer2.mThumbIdsP2[position]);


                    if (shipSelectedP2 == true) {
                        shipSelectedP2 = false;
                        whichViewP2.setVisibility(View.GONE);
                    }
                }
            }
        });
    }

    public void onClickShip5(View view) {
        whichViewP2 = view;
        ship5selectedP2 = true;
        shipSelectedP2 = true;
        ship4selectedP2 = false;
        ship3selectedP2 = false;
        ship2selectedP2 = false;
        ship1selectedP2 = false;
    }
    public void onClickShip4(View view) {
        whichViewP2 = view;
        ship4selectedP2 = true;
        shipSelectedP2 = true;
        ship5selectedP2 = false;
        ship3selectedP2 = false;
        ship2selectedP2 = false;
        ship1selectedP2 = false;
    }
    public void onClickShip3(View view) {
        whichViewP2 = view;
        ship3selectedP2 = true;
        shipSelectedP2 = true;
        ship4selectedP2 = false;
        ship5selectedP2 = false;
        ship2selectedP2 = false;
        ship1selectedP2 = false;
    }
    public void onClickShip2(View view) {
        whichViewP2 = view;
        ship2selectedP2 = true;
        shipSelectedP2 = true;
        ship4selectedP2 = false;
        ship3selectedP2 = false;
        ship5selectedP2 = false;
        ship1selectedP2 = false;
    }
    public void onClickShip1(View view) {
        whichViewP2 = view;
        ship1selectedP2 = true;
        shipSelectedP2 = true;
        ship4selectedP2 = false;
        ship3selectedP2 = false;
        ship2selectedP2 = false;
        ship5selectedP2 = false;
    }

    public void onClickReady(View view) {
        if(ship1PlacedP2 == true && ship2PlacedP2 == true && ship3PlacedP2 == true && ship4PlacedP2 == true && ship5PlacedP2 == true ) {
            Intent intent1 = new Intent(GridViewPlayer2.this, P1AttackScreen.class);
            startActivity(intent1);
            finish();
        }
    }
}

package com.example.ul.battleship12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.ul.battleship12.P1AttackAdapter.mThumbIdsA1;
import static com.example.ul.battleship12.GridViewPlayer2.*;

public class P1AttackScreen extends AppCompatActivity {
    boolean turnTaken = false;
    int all5 = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.text);
        text.setText("Player 1 - Choose A Square To Attack");

        Button ship1 = (Button)findViewById(R.id.ship1);
        ship1.setVisibility(View.GONE);

        Button ship2 = (Button)findViewById(R.id.ship2);
        ship2.setVisibility(View.GONE);

        Button ship3 = (Button)findViewById(R.id.ship3);
        ship3.setVisibility(View.GONE);

        Button ship4 = (Button)findViewById(R.id.ship4);
        ship4.setVisibility(View.GONE);

        Button ship5 = (Button)findViewById(R.id.ship5);
        ship5.setVisibility(View.GONE);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new P1AttackAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                if(position != 0 && position != 1 && position != 2 && position != 3 && position != 4 && position != 5 && position != 6 && position != 7 && position != 8 && position != 9 && position != 10 && position != 11 && position != 22 && position != 33 && position != 44 && position != 55 && position != 66 && position != 77 && position != 88 && position != 99 && position != 110) {
                    if (turnTaken == false && (position == ship3PosP2 || position == ship1PosP2 || position == ship2PosP2 || position == ship4PosP2 || position == ship5PosP2)) {
                        turnTaken = true;
                        mThumbIdsA1[position] = R.drawable.boom;
                    } else if (turnTaken == false) {
                        turnTaken = true;
                        mThumbIdsA1[position] = R.drawable.white;
                    }
                    ImageView imageView = (ImageView) v;
                    imageView.setImageResource(P1AttackAdapter.mThumbIdsA1[position]);
                }

                for(int i = 0; i < mThumbIdsA1.length; i++){
                    if(mThumbIdsA1[i] == R.drawable.boom){
                        all5 = all5 + 1;
                    }
                }

                if(all5 == 5){
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Player 1 Wins!");
                    Button buttonReady = (Button)findViewById(R.id.buttonReady);
                    buttonReady.setText("Quit");
                }
            }
        });
    }


    public void onClickReady(View view) {
        if(turnTaken == true && all5 != 5){
            Intent intent1 = new Intent(P1AttackScreen.this, P2AttackScreen.class);
            startActivity(intent1);
            finish();
        }else if(all5 == 5){
            finish();
            System.exit(0);
        }

    }
}

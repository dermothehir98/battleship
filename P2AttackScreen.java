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

import static com.example.ul.battleship12.P2AttackAdapter.mThumbIdsA2;
import static com.example.ul.battleship12.HelloGridView.*;

public class P2AttackScreen extends AppCompatActivity {
    boolean turnTakenP2 = false;
    int all5P2 = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.text);
        text.setText("Player 2 - Choose A Square To Attack");

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
        gridview.setAdapter(new P2AttackAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                if(position != 0 && position != 1 && position != 2 && position != 3 && position != 4 && position != 5 && position != 6 && position != 7 && position != 8 && position != 9 && position != 10 && position != 11 && position != 22 && position != 33 && position != 44 && position != 55 && position != 66 && position != 77 && position != 88 && position != 99 && position != 110) {
                    if (turnTakenP2 == false && (position == ship3Pos || position == ship1Pos || position == ship2Pos || position == ship4Pos || position == ship5Pos)) {
                        turnTakenP2 = true;
                        mThumbIdsA2[position] = R.drawable.boom;
                    } else if (turnTakenP2 == false) {
                        turnTakenP2 = true;
                        mThumbIdsA2[position] = R.drawable.white;
                    }
                    ImageView imageView = (ImageView) v;
                    imageView.setImageResource(P2AttackAdapter.mThumbIdsA2[position]);
                }

                for(int iP2 = 0; iP2 < mThumbIdsA2.length; iP2++){
                    if(mThumbIdsA2[iP2] == R.drawable.boom){
                        all5P2 = all5P2 + 1;
                    }
                }


                if(all5P2 == 5){
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Player 2 Wins!");
                    Button buttonReady = (Button)findViewById(R.id.buttonReady);
                    buttonReady.setText("Quit");
                }
            }
        });
    }


    public void onClickReady(View view) {
        if(turnTakenP2 == true && all5P2 != 5){
            Intent intent1 = new Intent(P2AttackScreen.this, P1AttackScreen.class);
            startActivity(intent1);
            finish();
        }else if(all5P2 == 5){
            finish();
            System.exit(0);
        }

    }
}

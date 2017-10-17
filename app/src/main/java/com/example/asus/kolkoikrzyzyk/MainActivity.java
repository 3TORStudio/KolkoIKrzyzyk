package com.example.asus.kolkoikrzyzyk;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import static android.R.color.holo_red_dark;
import static android.R.drawable.alert_light_frame;
import static android.R.drawable.ic_menu_close_clear_cancel;

public class MainActivity extends AppCompatActivity {
    private int counter = 1;
    private ArrayList<Integer> listOfClickedBtnId = new ArrayList<>();
    //private Drawable background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMark(View view){
        int viewId = view.getId();
        Button button = (Button)findViewById(viewId);

        if(counter % 2 == 1){
            listOfClickedBtnId.add(viewId);
            button.setTextSize(64);
            button.setText("x");
            //button.setBackgroundColor(0xff0099ff);
            button.setEnabled(false);
        } else {
            listOfClickedBtnId.add(viewId);
            //button.setBackgroundColor(0xff0099ff);
            button.setTextSize(64);
            button.setText("o");
            button.setEnabled(false);
        }
        setCounter("add");
    }

    public void onClickNewGame(View view){
        for(int idOfBtn : listOfClickedBtnId){
            Button button = (Button) findViewById(idOfBtn);
            button.setText(" ");
            //button.setBackground(R.drawable.class);
            button.setEnabled(true);
        }
        counter = 1;
    }

    public void onClickNewMatch(View view){
        onClickNewGame(view);
    }

    public void setCounter (String s){
        if (s.equals("add")){
            counter++;
        }
        if (s.equals("reset")){
            counter = 1;
        }
    }
}

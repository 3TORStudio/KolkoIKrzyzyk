package com.example.asus.kolkoikrzyzyk;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.color.holo_red_dark;
import static android.R.drawable.alert_light_frame;
import static android.R.drawable.ic_menu_close_clear_cancel;

public class MainActivity extends AppCompatActivity {
    private int counter = 1;
    private ArrayList<Integer> listOfClickedBtnId = new ArrayList<>();

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
            button.setEnabled(false);
        } else {
            listOfClickedBtnId.add(viewId);
            button.setTextSize(64);
            button.setText("o");
            button.setEnabled(false);
        }
        setCounter("add");

        if(counter > 5){
            checkTheState();
        }
    }

    public void onClickNewGame(View view){
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("new");
        for(int idOfBtn : listOfClickedBtnId){
            Button button = (Button) findViewById(idOfBtn);
            button.setText(" ");
            button.setEnabled(true);
        }
        setCounter("reset");
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


    public void checkTheState (){
        Button btn1 = (Button) findViewById(R.id.btn11);
        String s11 = btn1.getText().toString();
        Button btn2 = (Button) findViewById(R.id.btn12);
        String s12 = btn2.getText().toString();
        Button btn3 = (Button) findViewById(R.id.btn13);
        String s13 = btn3.getText().toString();
        Button btn4 = (Button) findViewById(R.id.btn21);
        String s21 = btn4.getText().toString();
        Button btn5 = (Button) findViewById(R.id.btn22);
        String s22 = btn5.getText().toString();
        Button btn6 = (Button) findViewById(R.id.btn23);
        String s23 = btn6.getText().toString();
        Button btn7 = (Button) findViewById(R.id.btn31);
        String s31 = btn7.getText().toString();
        Button btn8 = (Button) findViewById(R.id.btn32);
        String s32 = btn8.getText().toString();
        Button btn9 = (Button) findViewById(R.id.btn33);
        String s33 = btn9.getText().toString();

        TextView text = (TextView) findViewById(R.id.textView);

        if(s11.equals(s12) && s12.equals(s13) && s11 != " " ||
                s21.equals(s22) && s22.equals(s23) && s21 != " " ||
                s31.equals(s32) && s32.equals(s33) && s31 != " " ||

                s11.equals(s21) && s21.equals(s31) && s11 != " " ||
                s12.equals(s22) && s22.equals(s32) && s12 != " " ||
                s13.equals(s23) && s23.equals(s33) && s13 != " " ||

                s11.equals(s22) && s22.equals(s33) && s11 != " " ||
                s13.equals(s22) && s22.equals(s31) && s13 != " "
                ){
            text.setText("1");
        }
    }

    public int getCounter(){
        return counter;
    }


}

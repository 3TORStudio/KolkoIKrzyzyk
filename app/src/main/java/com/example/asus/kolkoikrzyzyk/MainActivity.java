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
    private List<Button> buttonList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMark(View view){
        int viewId = view.getId();
        Button button = (Button)findViewById(viewId);
        buttonList.add(button);
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
        checkTheState();
    }

    public void onClickNewGame(View view){
        for(int idOfBtn : listOfClickedBtnId){
            Button button = (Button) findViewById(idOfBtn);
            button.setText(" ");
            //button.setBackground(R.drawable.class);
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
        Button btn2 = (Button) findViewById(R.id.btn12);
        Button btn3 = (Button) findViewById(R.id.btn13);
        Button btn4 = (Button) findViewById(R.id.btn21);
        Button btn5 = (Button) findViewById(R.id.btn22);
        Button btn6 = (Button) findViewById(R.id.btn23);
        Button btn7 = (Button) findViewById(R.id.btn31);
        Button btn8 = (Button) findViewById(R.id.btn32);
        Button btn9 = (Button) findViewById(R.id.btn33);
        TextView text = (TextView) findViewById(R.id.textView);
        if(btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText())){
            text.setText("1");
        }
    }
}

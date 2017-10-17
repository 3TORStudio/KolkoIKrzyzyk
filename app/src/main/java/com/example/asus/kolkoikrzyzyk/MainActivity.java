package com.example.asus.kolkoikrzyzyk;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMark(View view){
        /*String a = view.getId();//res.getResourceEntryName(view.getId())
        Button button = (Button)findViewById(R.id.);*/
        int vId = view.getId();
        Button button = (Button)findViewById(vId);
        button.setText("x");

    }
}

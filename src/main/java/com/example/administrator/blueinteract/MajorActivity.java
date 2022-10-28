package com.example.administrator.blueinteract;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MajorActivity extends AppCompatActivity {

    Button wel_come;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button wel_come = (Button) findViewById(R.id.wel_com);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
    }

    //wel_come.setOnClickListener(new View.OnClickListener() {
    //  @Override
    //public void onClick(View view) {

    //  setContentView(R.layout.activity_major); // SLYM ADDED
    //}
    //});

    public void gotoMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

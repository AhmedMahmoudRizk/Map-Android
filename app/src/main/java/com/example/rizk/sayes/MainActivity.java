package com.example.rizk.sayes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addPlace,nearPlace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createAction();
    }

    private void createAction() {
        addPlace=(Button)findViewById(R.id.addPlace);
        nearPlace=(Button)findViewById(R.id.nearPlace);
        addPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AddPlace.class);
                startActivity(intent);
            }
        });
        nearPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,GetNearbyPlaces.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.charley.assigntwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class RandActivity extends AppCompatActivity{

    TextView randMainNum;
    Button buttonRand;
    Random rand = new Random();
    int randNum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rand_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        buttonRand = (Button)findViewById(R.id.butRand);
        randMainNum = (TextView)findViewById(R.id.randDisp);

        buttonRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randNum = rand.nextInt(100-0)+0;

                randMainNum.setText(String.valueOf(randNum));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }

        switch(id){
            case R.id.addSub:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                return true;

            default:
                return true;
        }

    }
}

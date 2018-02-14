package com.example.charley.assigntwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainNum;
    Button buttonAdd;
    Button buttonSub;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Connect buttons and total to their respective layout objects
        buttonAdd = (Button)findViewById(R.id.butAdd);
        buttonSub = (Button)findViewById(R.id.butSub);
        mainNum = (TextView)findViewById(R.id.countNum);


        //Handle clicking on the add and subtract buttons
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v1) {
                counter++;

                mainNum.setText(String.valueOf(counter));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v2){
                counter--;

                mainNum.setText(String.valueOf(counter));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }



        switch(id) {
            case R.id.rand:
                Intent intent = new Intent(getApplicationContext(), RandActivity.class);
                startActivity(intent);
                return true;

            default:
                return true;
        }
    }






}

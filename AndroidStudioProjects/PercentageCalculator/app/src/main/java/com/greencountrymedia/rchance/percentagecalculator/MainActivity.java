package com.greencountrymedia.rchance.percentagecalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView totalTextView;
    EditText percentageText;
    EditText numberText;
    //Boolean textEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


    }
    /*
    * Our button method and what happens when you click
     */
    public void calculateButton(View view){

         totalTextView = (TextView) findViewById(R.id.totalTextView);
         percentageText = (EditText) findViewById(R.id.percentageText);
         numberText = (EditText)findViewById(R.id.numberText);
         //textEmpty = false;
        if (percentageText.getText().toString().trim().length()==0) {
            Toast.makeText(MainActivity.this, "Please enter percentage", Toast.LENGTH_SHORT).show();


        }else if (numberText.getText().toString().trim().length()==0){
           Toast.makeText(MainActivity.this, "Please enter amount", Toast.LENGTH_SHORT).show();

        }else {
            float percentage = Float.parseFloat(percentageText.getText().toString());
            float decimal = percentage / 100;
            float total = decimal * Float.parseFloat(numberText.getText().toString());
            totalTextView.setText(Float.toString(total));
        }
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
        //R.id.
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

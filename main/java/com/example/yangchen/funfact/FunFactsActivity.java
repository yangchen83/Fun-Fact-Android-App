package com.example.yangchen.funfact;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    private FactBook factBook = new FactBook();
    private ColorBook colorBook = new ColorBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        final TextView factLabel = (TextView) findViewById(R.id.funFactTextView);
        final Button showFactButton =(Button) findViewById(R.id.showMoreButton);

        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                factLabel.setText(factBook.getFact());
                relativeLayout.setBackgroundColor(colorBook.getColor());
                showFactButton.setTextColor(colorBook.getColor());

            }
        };

        showFactButton.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
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

        return super.onOptionsItemSelected(item);
    }
}

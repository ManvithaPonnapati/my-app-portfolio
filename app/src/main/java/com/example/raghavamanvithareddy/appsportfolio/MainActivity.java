package com.example.raghavamanvithareddy.appsportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    int durationoftoast=Toast.LENGTH_SHORT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        return super.onOptionsItemSelected(item);
    }
    public void buttononClick(View view)
    {
        switch (view.getId()) {
            case R.id.spotify_button:
                Toast.makeText(MainActivity.this,"This will launch spotify app",durationoftoast).show();
                break;
            case R.id.scores_button:
                Toast.makeText(MainActivity.this,"This will launch scores app",durationoftoast).show();
                break;
            case R.id.library_button:
                Toast.makeText(MainActivity.this,"This will launch library app",durationoftoast).show();
                break;
            case R.id.capstone_button:
                Toast.makeText(MainActivity.this,"This will launch capstone app",durationoftoast).show();
                break;
            case R.id.xyz_button:
                Toast.makeText(MainActivity.this,"This will launch xyz reader app",durationoftoast).show();
                break;
            case R.id.bigger_button:
                Toast.makeText(MainActivity.this,"This will launch build it bigger app",durationoftoast).show();
                break;
        }
    }
}

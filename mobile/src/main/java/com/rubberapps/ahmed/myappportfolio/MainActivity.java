package com.rubberapps.ahmed.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Create buttons and their click listeners that will later launch my different apps
        Button btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
        if (btnSpotifyStreamer != null) btnSpotifyStreamer.setOnClickListener(this);
        Button btnFootballScoresApp = (Button) findViewById(R.id.btnFootballScoresApp);
        if (btnFootballScoresApp != null) btnFootballScoresApp.setOnClickListener(this);
        Button btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        if (btnLibraryApp != null) btnLibraryApp.setOnClickListener(this);
        Button btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        if (btnBuildItBigger != null) btnBuildItBigger.setOnClickListener(this);
        Button btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
        if (btnXYZReader != null) btnXYZReader.setOnClickListener(this);
        Button btnCapstone = (Button) findViewById(R.id.btnCapstone);
        if (btnCapstone != null) btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String staticMessage = "This button will launch my ";
        //handle the button presses and display a toast for the moment as to what app they will lunch in the future
        switch (v.getId()) {
            case R.id.btnSpotifyStreamer:
                Toast.makeText(MainActivity.this, staticMessage + getString(R.string.app1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnFootballScoresApp:
                Toast.makeText(MainActivity.this, staticMessage + getString(R.string.app2), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnLibraryApp:
                Toast.makeText(MainActivity.this, staticMessage + getString(R.string.app3), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBuildItBigger:
                Toast.makeText(MainActivity.this, staticMessage + getString(R.string.app4), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnXYZReader:
                Toast.makeText(MainActivity.this, staticMessage + getString(R.string.app5), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(MainActivity.this, staticMessage + getString(R.string.app6), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

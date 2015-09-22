package com.dallinwilcox.androidnanodegreeportfolio;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends Activity {
    Button popularMoviesButton;
    Button scoresAppButton;
    Button libraryAppButton;
    Button buildItBiggerButton;
    Button xyzReaderButton;
    Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);

        //need to define onClickListeners instead of inline layout references
        // due to instantiation at runtime for color
        popularMoviesButton = (Button) findViewById(R.id.button);
        scoresAppButton = (Button) findViewById(R.id.button2);
        libraryAppButton = (Button) findViewById(R.id.button3);
        buildItBiggerButton = (Button) findViewById(R.id.button4);
        xyzReaderButton = (Button) findViewById(R.id.button5);
        capstoneButton = (Button) findViewById(R.id.button6);

        popularMoviesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                launchPopularMovies();
            }
        });

        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                launchScoresApp();
            }
        });

        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                launchLibraryApp();
            }
        });

        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                launchBuildItBigger();
            }
        });

        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                launchXyzReader();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                launchCapstone();
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up Button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void launchPopularMovies()
    {
        toaster(R.string.popular_movies);
    }

    private void launchScoresApp()
    {
        toaster(R.string.scores_app);
    }

    private void launchLibraryApp()
    {
        toaster(R.string.library_app);
    }

    private void launchBuildItBigger()
    {
        toaster(R.string.build_it_bigger);
    }

    private void launchXyzReader()
    {
        toaster(R.string.xyz_reader);
    }

    private void launchCapstone()
    {
        toaster(R.string.capstone);
    }

    private void toaster(int rId)
    {
        Toast.makeText(PortfolioActivity.this, getString(rId), Toast.LENGTH_SHORT).show();
    }
}

package jesswalters.quotebot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import jesswalters.quotebot.R;

public class SeperatedFaves extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seperated_faves);
        final ListView separatedFaves = (ListView) findViewById(R.id.favesList);

        final String[] typeList = {"Sports Favorites", "Inspiring Favorites", "Proverb Favorites", "History/Famous Favorites", "Movie Favorites", "Military Favorites"};
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, typeList);
        separatedFaves.setAdapter(adapter);

        separatedFaves.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(SeperatedFaves.this, SportsFavorites.class);
                    SeperatedFaves.this.startActivity(intent);
                }
                else if (i == 1) {
                    Intent intent = new Intent(SeperatedFaves.this, InspireFavorites.class);
                    SeperatedFaves.this.startActivity(intent);
                }
                else if (i == 2) {
                    Intent intent = new Intent(SeperatedFaves.this, ProverbFavorites.class);
                    SeperatedFaves.this.startActivity(intent);
                }
                else if (i == 3) {
                    Intent intent = new Intent(SeperatedFaves.this, HistFavorites.class);
                    SeperatedFaves.this.startActivity(intent);
                }
                else if (i == 4) {
                    Intent intent = new Intent(SeperatedFaves.this, MovieFavorites.class);
                    SeperatedFaves.this.startActivity(intent);
                }
                else if (i == 5) {
                    Intent intent = new Intent(SeperatedFaves.this, MilFavorites.class);
                    SeperatedFaves.this.startActivity(intent);
                }
            }
        });
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_seperated_faves, menu);
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
    */
}

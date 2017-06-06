package jesswalters.quotebot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import jesswalters.quotebot.R;

public class MovieFavorites extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_favorites);
        final ListView faveView = (ListView) findViewById(R.id.movieList);
        final SharedPreferences sp = getSharedPreferences("prefs", Activity.MODE_PRIVATE);

        final Set<String> favedQuotes = sp.getStringSet("favedMovieQuotes", new HashSet<String>());

        final ArrayList<String> list = new ArrayList<String>();
        list.addAll(favedQuotes);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        faveView.setAdapter(adapter);

        faveView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
                //Make the Dialog box
                final AlertDialog.Builder builder = new AlertDialog.Builder(MovieFavorites.this);
                builder.setTitle("Favorite Quote:");

                builder.setMessage(list.get(i));

                //Adding the buttons
                builder.setPositiveButton("Share!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent shareIntent = new Intent(Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_TEXT, list.get(i));
                        startActivity(Intent.createChooser(shareIntent, "Share via..."));
                    }
                });

                builder.setNeutralButton("Remove from Favorites", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences.Editor editor = sp.edit();
                        Set<String> newFavedQuotes = sp.getStringSet("favedQuotes", new HashSet<String>());
                        newFavedQuotes.remove(list.get(i));
                        Set<String> newFavedMovieQuotes = sp.getStringSet("favedMovieQuotes", new HashSet<String>());
                        newFavedMovieQuotes.remove(list.get(i));
                        editor.putStringSet("favedMovieQuotes", newFavedMovieQuotes);
                        editor.apply();
                        editor.putStringSet("favedQuotes", newFavedQuotes);
                        editor.apply();
                        dialog.dismiss();
                        //Refreshing activity to remove unfaved quote from view
                        Intent intent = new Intent(MovieFavorites.this, MovieFavorites.class);
                        MovieFavorites.this.startActivity(intent);
                        Toast.makeText(MovieFavorites.this, "Quote successfully removed", Toast.LENGTH_SHORT).show();

                    }
                });


                builder.create().show();
            }
        });

    }
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movie_favorites, menu);
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
*/

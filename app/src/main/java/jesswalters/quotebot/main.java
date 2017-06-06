package jesswalters.quotebot;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;


public class main extends Activity implements GestureDetector.OnGestureListener {
    int i = 1;
    private Quotes mQuotes = new Quotes();
    private ColorChange mColorWheel = new ColorChange();
    public String curQuote = "Please select a quote";
    public String lastQuote = null;
    public Set<String> prevQuotes = new HashSet<String>();
    Calendar cal = Calendar.getInstance();
    final String APP_PNAME = "jesswalters.motivationalquotes";

    GestureDetector detector;



    //Setting up the text switcher and the animations
    TextSwitcher textSwitcher;
    Animation slide_in_left, slide_out_right, slide_out_left, slide_in_right;
    //hasQuote determines if any quotes have been returned

    int hasQuote = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppRater.app_launched(this);
        detector = new GestureDetector(this);

        //Declaration of all Variables
        final SharedPreferences sp = getSharedPreferences("prefs", Activity.MODE_PRIVATE);
        final ImageView faveButton = (ImageView) findViewById(R.id.faveQuote);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        final Button copyButton = (Button) findViewById(R.id.copyButton);
        final Button dayButton = (Button) findViewById(R.id.dayButton);
        final TextView topText = (TextView) findViewById(R.id.topText);
        final ImageSwitcher imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        final int todayDate = cal.get(Calendar.DAY_OF_MONTH);

        //Setting default pic to faveButton
        faveButton.setImageResource(R.drawable.star_icon);

        //setting the text switcher to the id
        textSwitcher = (TextSwitcher) findViewById(R.id.textswitcher);

        //Setting up the animations for the text switcher
        slide_in_left = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        slide_out_right = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        slide_out_left = AnimationUtils.loadAnimation(this, R.anim.slide_out_left);
        slide_in_right = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        //set the animations to the textSwitcher
        textSwitcher.setInAnimation(slide_out_left);
        textSwitcher.setOutAnimation(slide_in_right);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(main.this);
                textView.setTextSize(24);
                textView.setTextColor(Color.WHITE);
                textView.setGravity(Gravity.CENTER_HORIZONTAL);
                textView.setTypeface(Typeface.DEFAULT);
                return textView;
            }
        });




        //Determining what to set starting text as
        startViewMethod(imageSwitcher);
        textSwitcher.setText("");

        View.OnClickListener copyListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                copyQuote();
            }
        };
        copyButton.setOnClickListener(copyListener);

        //Quote of the day Listener
        View.OnClickListener dayListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getQuoteOfDay(imageSwitcher, sp, todayDate, topText, relativeLayout, copyButton, dayButton, faveButton);

            }

        };
        dayButton.setOnClickListener(dayListener);

        //Favorites on click listener
        final View.OnClickListener faveListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasQuote == 0) {
                    Toast.makeText(main.this, "I don't have a quote to favorite.", Toast.LENGTH_LONG).show();
                }
                if (hasQuote == 1) {
                    faveButton.setImageResource(R.drawable.star_icon_pressed);
                    SharedPreferences.Editor editor = sp.edit();
                    Set<String> favedQuotes = sp.getStringSet("favedQuotes", new HashSet<String>());
                    Set<String> favedInspireQuotes = sp.getStringSet("favedInspireQuotes", new HashSet<String>());
                    Set<String> favedProverbs = sp.getStringSet("favedProverbs", new HashSet<String>());
                    Set<String> favedMovieQuotes = sp.getStringSet("favedMovieQuotes", new HashSet<String>());
                    Set<String> favedMilQuotes = sp.getStringSet("favedMilQuotes", new HashSet<String>());
                    Set<String> favedSportsQuotes = sp.getStringSet("favedSportsQuotes", new HashSet<String>());
                    Set<String> favedHistQuotes = sp.getStringSet("favedHistQuotes", new HashSet<String>());
                    String typeQuote = sp.getString("type_quote", "1");
                    if (favedQuotes.contains(curQuote)) {
                        Toast.makeText(main.this, "This quote is already in your favorites!", Toast.LENGTH_SHORT).show();
                    } else {
                        //Checking to see what category the quote fits under
                        if (typeQuote.equals("1")) {
                            if (Arrays.asList(mQuotes.sQuotes).contains(curQuote)) {
                                favedQuotes.add(curQuote);
                                favedSportsQuotes.add(curQuote);
                                editor.putStringSet("favedSportsQuotes", favedSportsQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            } else if (Arrays.asList(mQuotes.mQuotes).contains(curQuote)) {
                                favedQuotes.add(curQuote);
                                favedInspireQuotes.add(curQuote);
                                editor.putStringSet("favedInspireQuotes", favedInspireQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            } else if (Arrays.asList(mQuotes.pQuotes).contains(curQuote)) {
                                favedQuotes.add(curQuote);
                                favedProverbs.add(curQuote);
                                editor.putStringSet("favedProverbs", favedProverbs);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            } else if (Arrays.asList(mQuotes.histQuotes).contains(curQuote)) {
                                favedQuotes.add(curQuote);
                                favedHistQuotes.add(curQuote);
                                editor.putStringSet("favedHistQuotes", favedHistQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            }
                            else if (Arrays.asList(mQuotes.movQuotes).contains(curQuote)) {
                                favedQuotes.add(curQuote);
                                favedMovieQuotes.add(curQuote);
                                editor.putStringSet("favedMovieQuotes", favedMovieQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            }
                            else if (Arrays.asList(mQuotes.milQuotes).contains(curQuote)) {
                                favedQuotes.add(curQuote);
                                favedMilQuotes.add(curQuote);
                                editor.putStringSet("favedMilQuotes", favedMilQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            }
                        }
                              else if (typeQuote.equals("2")) {
                                favedQuotes.add(curQuote);
                                favedSportsQuotes.add(curQuote);
                                editor.putStringSet("favedSportsQuotes", favedSportsQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            }
                        else if (typeQuote.equals("3")) {
                                favedQuotes.add(curQuote);
                                favedInspireQuotes.add(curQuote);
                                editor.putStringSet("favedInspireQuotes", favedInspireQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            }
                        else if (typeQuote.equals("4")) {
                                favedQuotes.add(curQuote);
                                favedProverbs.add(curQuote);
                                editor.putStringSet("favedProverbs", favedProverbs);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            }
                        else if (typeQuote.equals("5")) {
                                favedQuotes.add(curQuote);
                                favedHistQuotes.add(curQuote);
                                editor.putStringSet("favedHistQuotes", favedHistQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            }
                        else if (typeQuote.equals("6")) {
                                favedQuotes.add(curQuote);
                                favedMovieQuotes.add(curQuote);
                                editor.putStringSet("favedMovieQuotes", favedMovieQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            }
                        else if (typeQuote.equals("7")) {
                                favedQuotes.add(curQuote);
                                favedMilQuotes.add(curQuote);
                                editor.putStringSet("favedMilQuotes", favedMilQuotes);
                                editor.apply();
                                editor.putStringSet("favedQuotes", favedQuotes);
                                editor.apply();
                                Toast.makeText(main.this, "Added to your favorites!", Toast.LENGTH_SHORT).show();
                            }


                    }
                    rotateIcon(faveButton);
                }

            }

        };
        faveButton.setOnClickListener(faveListener);
    }

    public void getQuoteOfDay(ImageSwitcher imageSwitcher, SharedPreferences sp, int todayDate, TextView topText, RelativeLayout relativeLayout, Button copyButton, Button dayButton, ImageView faveButton) {
        //Sets the initial switcher to a small alpha image to disapear
        imageSwitcher.setImageResource(R.drawable.blankfill);
        //sets to the quote of the day
        // int todayDate = cal.get(Calendar.DAY_OF_MONTH);
        SharedPreferences.Editor editor = sp.edit();
        int lastDate = sp.getInt("lastDay", -1);
        String type = sp.getString("type_quote", "1");
        if (todayDate != lastDate) {
            Boolean isTTs = sp.getBoolean("enableTTs", false);
            String quote = mQuotes.getQuote(type);
            textSwitcher.setText(quote);
            topText.setText("Quote of the Day:");
            int color = mColorWheel.getColor();
            relativeLayout.setBackgroundColor(color);
            copyButton.setTextColor(color);
            dayButton.setTextColor(color);
            editor.putString("quoteOfDay", quote);
            editor.apply();
            curQuote = quote;
            hasQuote = 1;
            if (isTTs) {
                //put tts intent here
            }
            Set<String> favedQuotes = sp.getStringSet("favedQuotes", new HashSet<String>());
            if (favedQuotes.contains(quote)) {
                faveButton.setImageResource(R.drawable.star_icon_pressed);
            } else {
                faveButton.setImageResource(R.drawable.star_icon);
            }

        } else if (todayDate == lastDate) {
            Boolean isTTs = sp.getBoolean("enableTTs", false);
            String dayQuote = sp.getString("quoteOfDay", null);
            SharedPreferences.Editor editor2 = sp.edit();
            textSwitcher.setText(dayQuote);
            topText.setText("Quote of the Day:");
            int color = mColorWheel.getColor();
            relativeLayout.setBackgroundColor(color);
            copyButton.setTextColor(color);
            dayButton.setTextColor(color);
            curQuote = dayQuote;
            hasQuote = 1;
            if (isTTs) {
                //put TTs intent here
            }
            Set<String> favedQuotes = sp.getStringSet("favedQuotes", new HashSet<String>());
            if (favedQuotes.contains(dayQuote)) {
                faveButton.setImageResource(R.drawable.star_icon_pressed);
            } else {
                faveButton.setImageResource(R.drawable.star_icon);
            }
        }
        editor.putInt("lastDay", todayDate);
        editor.apply();
    }

    private void nextQuote(/*SharedPreferences sp, ImageView faveButton, RelativeLayout relativeLayout, Button copyButton, Button dayButton, TextView topText*/) {
        final SharedPreferences sp = getSharedPreferences("prefs", Activity.MODE_PRIVATE);
        final ImageView faveButton = (ImageView) findViewById(R.id.faveQuote);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        final Button copyButton = (Button) findViewById(R.id.copyButton);
        final Button dayButton = (Button) findViewById(R.id.dayButton);
        final TextView topText = (TextView) findViewById(R.id.topText);
        final ImageSwitcher imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);

        imageSwitcher.setImageResource(R.drawable.blankfill);

        SharedPreferences.Editor editor = sp.edit();
        String type = sp.getString("type_quote", "1");
        if (lastQuote != null) {
            prevQuotes.add(lastQuote);
            //Toast.makeText(main.this, "Test log", Toast.LENGTH_SHORT).show();
        }
        Set<String> favedQuotes = sp.getStringSet("favedQuotes", new HashSet<String>());
        String quote = mQuotes.getQuote(type);
        if (favedQuotes.contains(quote)) {
            faveButton.setImageResource(R.drawable.star_icon_pressed);
        } else {
            faveButton.setImageResource(R.drawable.star_icon);
        }
        textSwitcher.setOutAnimation(slide_out_right);
        textSwitcher.setInAnimation(slide_in_left);
        textSwitcher.setText(quote);

        //Changes all of the color on background and text on buttons
        int color = mColorWheel.getColor();
        relativeLayout.setBackgroundColor(color);
        copyButton.setTextColor(color);
        dayButton.setTextColor(color);
        topText.setText("Your Quote:");
        curQuote = quote;
        hasQuote = 1;
        editor.putString("curQuote", quote);
        editor.apply();
        lastQuote = quote;
        i=1;
    }

    private void previousQuotes(/*SharedPreferences sp, ImageView faveButton, RelativeLayout relativeLayout, Button copyButton, Button dayButton, TextView topText*/) {
        final SharedPreferences sp = getSharedPreferences("prefs", Activity.MODE_PRIVATE);
        final ImageView faveButton = (ImageView) findViewById(R.id.faveQuote);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        final Button copyButton = (Button) findViewById(R.id.copyButton);
        final Button dayButton = (Button) findViewById(R.id.dayButton);
        final TextView topText = (TextView) findViewById(R.id.topText);

        SharedPreferences.Editor editor = sp.edit();
        String quote;
        String[] quoteArray = new String[prevQuotes.size()];
        prevQuotes.toArray(quoteArray);
        if (i > quoteArray.length) {
            Toast.makeText(this, "No more previous quotes. Get some more!", Toast.LENGTH_SHORT).show();
        }
        else {

            quote = quoteArray[i - 1];
            textSwitcher.setOutAnimation(slide_out_left);
            textSwitcher.setInAnimation(slide_in_right);
            textSwitcher.setText(quote);
            Set<String> favedQuotes = sp.getStringSet("favedQuotes", new HashSet<String>());
            if (favedQuotes.contains(quote)) {
                faveButton.setImageResource(R.drawable.star_icon_pressed);
            } else {
                faveButton.setImageResource(R.drawable.star_icon);
            }
            int color = mColorWheel.getColor();
            relativeLayout.setBackgroundColor(color);
            copyButton.setTextColor(color);
            dayButton.setTextColor(color);
            topText.setText("Your Quote:");
            curQuote = quote;
            hasQuote = 1;
            editor.putString("curQuote", quote);
            editor.apply();
            i++;
        }
    }


    //Action bar code
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        //Share button support
        /*MenuItem shareItem = (MenuItem) menu.findItem(R.id.menu_item_share);

        ShareActionProvider mShare = (ShareActionProvider) shareItem.getActionProvider(); */




        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

       switch (item.getItemId()) {
           case R.id.menu_item_share:
               shareMethod();
               return true;
           case R.id.copyQuote:
               copyQuote();
               return true;
           case R.id.action_settings:
               startSettings();
               return true;
           case R.id.action_favorites:
               startFavorites();
               return true;
           default:
               return super.onOptionsItemSelected(item);
       }
    }

    private void startFavorites() {
        SharedPreferences sp = getSharedPreferences("prefs", MODE_PRIVATE);
        Boolean splitFavorites = sp.getBoolean("split_favorites", false);
        if (splitFavorites) {
            Intent intent = new Intent(main.this, SeperatedFaves.class);
            main.this.startActivity(intent);
        }

        else{
            Intent intent = new Intent(main.this, FavoritesActivity.class);
            main.this.startActivity(intent);
        }
    }
    private void shareMethod() {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, curQuote);
        startActivity(Intent.createChooser(shareIntent, "Share via..."));
    }
    private void copyQuote() {
        if (hasQuote == 1) {
            android.text.ClipboardManager clipboard = (android.text.ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
            clipboard.setText(curQuote);
            Toast.makeText(getApplicationContext(), "Quote copied to clipboard", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "You need a quote to copy", Toast.LENGTH_SHORT).show();
        }


    }

    private void startSettings() {
        Intent intent = new Intent(main.this, Preferences.class);
        main.this.startActivity(intent);


    }

    private void rotateIcon(ImageView button) {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(500);
        rotateAnimation.setRepeatCount(0);
        button.startAnimation(rotateAnimation);
    }


    private void startViewMethod(ImageSwitcher imageSwitcher) {

        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fadeout);

        imageSwitcher.setInAnimation(fadeIn);
        imageSwitcher.setOutAnimation(fadeOut);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(main.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });
        imageSwitcher.setImageResource(R.drawable.start_screen);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return detector.onTouchEvent(event);
    }
    @Override
    public boolean onDown(MotionEvent e) {
        //Toast.makeText(getApplicationContext(), "OnDown Gesture", Toast.LENGTH_SHORT).show();
        return false;
    }
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if(velocityX < -100) {
            previousQuotes(); // swipe right to left
        }
        else if(velocityX > 100){
            nextQuote(); //swipe left to right
        }

        return true;
    }
    @Override
    public void onLongPress(MotionEvent e) {
        //Toast.makeText(getApplicationContext(), "Long Press Gesture", Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        //Toast.makeText(getApplicationContext(), "Scroll Gesture", Toast.LENGTH_SHORT).show();
        return false; }
    @Override
    public void onShowPress(MotionEvent e) {
        //Toast.makeText(getApplicationContext(), "Show Press gesture", Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        //Toast.makeText(getApplicationContext(), "Single Tap Gesture", Toast.LENGTH_SHORT).show();
        return true;
    }

}


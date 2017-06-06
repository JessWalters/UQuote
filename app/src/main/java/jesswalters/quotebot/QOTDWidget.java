package jesswalters.quotebot;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViews;
import android.widget.TextView;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import jesswalters.quotebot.R;

/**
 * Implementation of App Widget functionality.
 */
public class QOTDWidget extends AppWidgetProvider {

    private static Quotes mQuotes = new Quotes();
    static Calendar cal = Calendar.getInstance();

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        final int N = appWidgetIds.length;
        for (int i = 0; i < N; i++) {
            updateAppWidget(context, appWidgetManager, appWidgetIds[i]);
        }

    }


    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        // Construct the RemoteViews object

        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.qotdwidget);
        final SharedPreferences sp = context.getSharedPreferences("prefs", Activity.MODE_PRIVATE);
        int todayDate = cal.get(Calendar.DAY_OF_MONTH);
        SharedPreferences.Editor editor = sp.edit();
        int lastDate = sp.getInt("lastDay", -1);
        String type = sp.getString("type_quote", "1");
        if (todayDate != lastDate) {
            Random random = new Random();
            int randomInt = random.nextInt(6);
            editor.putInt("type_int", randomInt);
            String quote = mQuotes.getQuote(type);
            views.setTextViewText(R.id.QOTDwidget, quote);
            editor.putString("quoteOfDay", quote);
            editor.apply();
            editor.putString("curQuote", quote);
            editor.apply(); }
        else if (todayDate == lastDate) {
            String dayQuote = sp.getString("quoteOfDay", null);
            SharedPreferences.Editor editor2 = sp.edit();
            views.setTextViewText(R.id.QOTDwidget, dayQuote);
            editor2.putString("curQuote", dayQuote);
            editor2.apply();
        }
        editor.putInt("lastDay", todayDate);
        editor.apply();
            // Instruct the widget manager to update the widget
            appWidgetManager.updateAppWidget(appWidgetId, views);


       }
    }




package jesswalters.quotebot;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by jessw on 11/1/2014.
 */
public class AppRater {
    private final static String APP_TITLE = "Inspiring Quotes";
    private final static String APP_PNAME = "jesswalters.motivationalquotes";

    private final static int DAYS_UNTIL_PROMPT = 5;
    private final static int LAUNCHES_UNTIL_PROMPT = 10;

    public static void app_launched(Context mContext) {
        SharedPreferences prefs = mContext.getSharedPreferences("apprater", 0);
        if (prefs.getBoolean("dontshowagain", false)) {
            return ;
        }

        SharedPreferences.Editor editor = prefs.edit();

        // Increment launch counter
        long launch_count = prefs.getLong("launch_count", 0) + 1;
        editor.putLong("launch_count", launch_count);

        // Get date of first launch
        Long date_firstLaunch = prefs.getLong("date_firstlaunch", 0);
        if (date_firstLaunch == 0) {
            date_firstLaunch = System.currentTimeMillis();
            editor.putLong("date_firstlaunch", date_firstLaunch);
        }

        // Wait at least n days before opening
        if (launch_count >= LAUNCHES_UNTIL_PROMPT) {
            if (System.currentTimeMillis() >= date_firstLaunch +
                    (DAYS_UNTIL_PROMPT * 24 * 60 * 60 * 1000)) {
                showRateDialog(mContext, editor);
            }
        }
        showRateDialog(mContext, editor);
        editor.apply();
    }

    public static void showRateDialog(final Context mContext, final SharedPreferences.Editor editor) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setTitle("Rate " + APP_TITLE);

        builder.setMessage("If you enjoy using " + APP_TITLE + ", please take a moment to rate it. Thanks for your support!");

        builder.setPositiveButton("Rate", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    mContext.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + APP_PNAME)));
                }
                catch (ActivityNotFoundException e) {
                    Log.e(AppRater.class.getSimpleName(), "Market Intent not found");
                }
            }
        });


            builder.setNeutralButton("No Thanks!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (editor != null) {
                        editor.putBoolean("dontshowagain", true);
                        editor.commit();
                    }

                }
            });
        AlertDialog dialog = builder.show();
        dialog.show();
    }
}
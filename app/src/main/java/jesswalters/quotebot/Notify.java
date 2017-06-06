package jesswalters.quotebot;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;

import java.util.Calendar;
import java.util.Random;

public class Notify extends Service {
    public Notify() {
    }
    public Quotes mQuotes = new Quotes();
    static Calendar cal = Calendar.getInstance();
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public void onCreate(){


        Uri notifySound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        NotificationManager mNM = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        Intent launchIntent = new Intent(this.getApplicationContext(), main.class);
        PendingIntent pIntent = PendingIntent.getActivity(this, 0, launchIntent, 0);
        String notifyQuote = "";

        final SharedPreferences sp = getSharedPreferences("prefs", Activity.MODE_PRIVATE);
        int todayDate = cal.get(Calendar.DAY_OF_MONTH);
        SharedPreferences.Editor editor = sp.edit();
        int lastDate = sp.getInt("lastDay", -1);
        String type = sp.getString("type_quote", "1");
        if (todayDate != lastDate) {
            Random random = new Random();
            int randomInt = random.nextInt(6);
            editor.putInt("type_int", randomInt);
            String quote = mQuotes.getQuote(type);
            notifyQuote = quote;
            editor.putString("quoteOfDay", quote);
            editor.apply();
            editor.putString("curQuote", quote);
            editor.apply(); }
        else if (todayDate == lastDate) {
            String dayQuote = sp.getString("quoteOfDay", null);
            notifyQuote = dayQuote;
            SharedPreferences.Editor editor2 = sp.edit();
            editor2.putString("curQuote", dayQuote);
            editor2.apply();

        }
        editor.putInt("lastDay", todayDate);
        editor.apply();

        Notification mNotify = new Notification.Builder(this)
                .setContentTitle("Your quote of the day!")
                .setContentText(notifyQuote)
                .setSmallIcon(R.drawable.notification)
                .setSound(notifySound)
                .setStyle(new Notification.BigTextStyle().bigText(notifyQuote))
                .addAction(0, "Open app", pIntent)
                .build();

        mNM.notify(1, mNotify);
    }
}

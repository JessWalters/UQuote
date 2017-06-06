package jesswalters.quotebot;


import android.app.Activity;
import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.util.Log;
import android.widget.*;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class Preferences extends PreferenceActivity {

    private PendingIntent alarmIntent;
    private AlarmManager alarmManager;
    final String APP_PNAME = "jesswalters.motivationalquotes";
    DateFormat dateFormat = DateFormat.getDateTimeInstance();
    Calendar calendar = Calendar.getInstance();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addPreferencesFromResource(R.xml.pref_general);
        addPreferencesFromResource(R.xml.pref_notification);
        addPreferencesFromResource(R.xml.pref_misc);
        final ListPreference notifyFreq = (ListPreference) findPreference("notifications_frequency");
        final ListPreference typeQuote = (ListPreference) findPreference("type_quotes");
        final CheckBoxPreference separateCheck = (CheckBoxPreference) findPreference("split_faves");
        final SharedPreferences sp = getSharedPreferences("prefs", Activity.MODE_PRIVATE);
        final Preference reportBug = findPreference("bugReport");
        final Preference shareApp = findPreference("shareApp");
        final CheckBoxPreference enableTTS = (CheckBoxPreference) findPreference("tts_enable");
        final CheckBoxPreference enableNotifiction = (CheckBoxPreference) findPreference("notifications_enable");

        String quoteTypeSetter = sp.getString("type_quote", "1");
        typeQuote.setValue(quoteTypeSetter);
        setSummary();
        final SharedPreferences.Editor editor = sp.edit();


        shareApp.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                shareMethod();
                return true;
            }
        });


        reportBug.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                reportABug();
                return true;
            }
        });
        typeQuote.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {


                if (newValue.toString().equals("1")) {
                    editor.putString("type_quote", newValue.toString());
                    editor.apply();
                    typeQuote.setSummary("All Quotes");
                    Toast.makeText(Preferences.this, "Prepare to be flooded with all of these quotes!", Toast.LENGTH_LONG).show();
                } else if (newValue.toString().equals("2")) {
                    editor.putString("type_quote", newValue.toString());
                    editor.apply();
                    typeQuote.setSummary("Sports Quotes");
                    Toast.makeText(Preferences.this, "Sports Quotes coming your way!", Toast.LENGTH_LONG).show();
                } else if (newValue.toString().equals("3")) {
                    editor.putString("type_quote", newValue.toString());
                    editor.apply();
                    typeQuote.setSummary("Inspiring Quotes");
                    Toast.makeText(Preferences.this, "These Inspirational quotes are well... Inspiring", Toast.LENGTH_LONG).show();
                } else if (newValue.toString().equals("4")) {
                    editor.putString("type_quote", newValue.toString());
                    editor.apply();
                    typeQuote.setSummary("Proverbs");
                    Toast.makeText(Preferences.this, "Proverbs on Proverbs on Proverbs!", Toast.LENGTH_LONG).show();
                } else if (newValue.toString().equals("5")) {
                    editor.putString("type_quote", newValue.toString());
                    editor.apply();
                    typeQuote.setSummary("Historical/Famous Quotes");
                    Toast.makeText(Preferences.this, "Historical Quotes coming right up!", Toast.LENGTH_LONG).show();
                } else if (newValue.toString().equals("6")) {
                    editor.putString("type_quote", newValue.toString());
                    editor.apply();
                    typeQuote.setSummary("Movie Quotes");
                    Toast.makeText(Preferences.this, "Great Movie Quotes, these are!", Toast.LENGTH_LONG).show();
                } else if (newValue.toString().equals("7")) {
                    editor.putString("type_quote", newValue.toString());
                    editor.apply();
                    typeQuote.setSummary("Military Quotes");
                    Toast.makeText(Preferences.this, "We're at periscope depth, Military Quotes armed!", Toast.LENGTH_LONG).show();
                }
                return true;
            }


        });
        notifyFreq.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                alarmManager = (AlarmManager)Preferences.this.getSystemService(Preferences.ALARM_SERVICE);
                Intent intent = new Intent(Preferences.this, Notify.class);
                alarmIntent = PendingIntent.getService(Preferences.this, 0, intent, 0);
                Calendar cal = Calendar.getInstance();
                long alarmTime;

                if (alarmManager != null) {
                   cancelAlarm();
                }
                cal.setTimeInMillis(System.currentTimeMillis());
                if (newValue.toString().equals("1")) {
                    cal.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 4, 0);
                }
                else if (newValue.toString().equals("2")) {
                    cal.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 9, 0);
                }
                else if (newValue.toString().equals("3")) {
                    cal.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 12, 0);
                }
                else if (newValue.toString().equals("4")) {
                    cal.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 15, 0);
                }
                else if (newValue.toString().equals("5")) {
                    cal.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 18, 30);
                }
                else if (newValue.toString().equals("6")) {
                    cal.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 23, 15);
                }
                else {
                    Toast.makeText(Preferences.this, "Something bad happened! Please let me know with the Report a Bug button! Thanks!", Toast.LENGTH_SHORT).show();
                }

                alarmTime = cal.getTimeInMillis() - calendar.getTimeInMillis();

                if (alarmTime < 0) {
                    alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis() + (1000 * 60 * 60 *24), AlarmManager.INTERVAL_DAY, alarmIntent);
                }
                else {
                    alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), AlarmManager.INTERVAL_DAY, alarmIntent);
                }

                //Toast.makeText(Preferences.this, "Successfully set!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });


        separateCheck.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

                if (separateCheck.isChecked()) {
                    boolean isChecked = true;
                    editor.putBoolean("split_favorites", isChecked);
                    editor.apply();
                    Toast.makeText(Preferences.this, "Favorites are now separate", Toast.LENGTH_SHORT).show();
                }
                else {
                    boolean isChecked = false;
                    editor.putBoolean("split_favorites", isChecked);
                    editor.apply();
                    Toast.makeText(Preferences.this, "Favorites are no longer separate", Toast.LENGTH_SHORT).show();

                    if (alarmManager != null) {
                        alarmManager.cancel(alarmIntent);
                        //Toast.makeText(Preferences.this, "Alarm Cleared", Toast.LENGTH_SHORT).show();
                    }
                }

                return false;
            }
        });

        //Is notifications enabled
        enableNotifiction.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

                if (enableNotifiction.isChecked()) {
                    Toast.makeText(Preferences.this, "Daily Quotes are now Enabled", Toast.LENGTH_SHORT).show();
                } else {
                    cancelAlarm();
                    Toast.makeText(Preferences.this, "Daily Quotes are now disabled", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

    }

    public void setSummary() {
        final ListPreference typeQuote = (ListPreference) findPreference("type_quotes");
        final SharedPreferences sp = getSharedPreferences("prefs", Activity.MODE_PRIVATE);
        String curValue = sp.getString("type_quote", "1");
        if (curValue.equals("1")) {
            typeQuote.setSummary("All Quotes");
        } else if (curValue.equals("2")) {
            typeQuote.setSummary("Sports Quotes");
        } else if (curValue.equals("3")) {
            typeQuote.setSummary("Inspiring Quotes");
        } else if (curValue.equals("4")) {
            typeQuote.setSummary("Proverbs");
        } else if (curValue.equals("5")) {
            typeQuote.setSummary("Historical/Famous Quotes");
        } else if (curValue.equals("6")) {
            typeQuote.setSummary("Movie Quotes");
        } else if (curValue.equals("7")) {
            typeQuote.setSummary("Military Quotes");
        }

    }

    private void reportABug() {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"xenappsdev@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "I found a bug!!!");
        i.putExtra(Intent.EXTRA_TEXT, "Please describe the bug here. Thanks");
        startActivity(Intent.createChooser(i, "Send email via..."));
    }

    private void shareMethod() {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=jesswalters.motivationalquotes");
        startActivity(Intent.createChooser(shareIntent, "Share via..."));
    }

    private void cancelAlarm() {
        Intent cancelIntent = new Intent (Preferences.this, Notify.class);
        PendingIntent pendingIntent = PendingIntent.getService(Preferences.this, 0, cancelIntent, 0);
        AlarmManager cancelManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        cancelManager.cancel(pendingIntent);
    }


}




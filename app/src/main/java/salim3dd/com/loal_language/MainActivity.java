package salim3dd.com.loal_language;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.BTN_ar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale("ar");
            }
        });
        findViewById(R.id.BTN_en).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale("en");
            }
        });
    }

    @SuppressWarnings("deprecation")
    public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);

        DisplayMetrics dm = getResources().getDisplayMetrics();
        Configuration conf = getResources().getConfiguration();
        conf.locale = myLocale;
        getResources().updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
    }

/*         "en" = English
            "hi" =Hindi
            "fr" =French
            "it" =Italian
            "de" =German
            "es" =Spanish
            "ja" =Japanese
            "ko" =Korean
            "nl" =Dutch
            "pt" =Portuguese
            "ru" =Russian
            "zh" =Chinese
            "ar" = arabic

   */
}

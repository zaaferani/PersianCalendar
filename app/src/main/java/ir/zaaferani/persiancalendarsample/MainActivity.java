package ir.zaaferani.persiancalendarsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ir.zaaferani.persiancalendar.PersianCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersianCalendar persianCal = new PersianCalendar();

        ((TextView)findViewById(R.id.date)).setText(persianCal.getPersianShortDate());

    }
}

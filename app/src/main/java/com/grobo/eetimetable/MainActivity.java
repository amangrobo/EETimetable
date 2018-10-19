package com.grobo.eetimetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    int dayOfWeek;

    public void nextClicked(View view) {

        TextView dayTextView = (TextView) findViewById(R.id.dayTextView);
        LinearLayout timetableLayout = (LinearLayout) findViewById(R.id.timetableLayout);
        ImageView timetableImage = (ImageView) findViewById(R.id.timetableImage);

        if  (dayTextView.getText().toString() == "MONDAY") {
            dayTextView.setText("TUESDAY");
            timetableImage.setImageResource(R.drawable.tuesday);

        } else if  (dayTextView.getText().toString() == "TUESDAY") {
            dayTextView.setText("WEDNESDAY");
            timetableImage.setImageResource(R.drawable.wednesday);

        } else if  (dayTextView.getText().toString() == "WEDNESDAY") {
            dayTextView.setText("THURSDAY");
            timetableImage.setImageResource(R.drawable.thursday);

        } else if  (dayTextView.getText().toString() == "THURSDAY") {
            dayTextView.setText("FRIDAY");
            timetableImage.setImageResource(R.drawable.friday);

        } else if  (dayTextView.getText().toString() == "FRIDAY") {
            dayTextView.setText("SATURDAY");
            timetableImage.setImageResource(R.drawable.saturday);

        } else if  (dayTextView.getText().toString() == "SATURDAY") {
            dayTextView.setText("SUNDAY");
            timetableImage.setImageResource(R.drawable.saturday);

        } else if  (dayTextView.getText().toString() == "SUNDAY") {
            dayTextView.setText("MONDAY");
            timetableImage.setImageResource(R.drawable.monday);

        }

    }

    public void previousButtonClicked(View view) {

        TextView dayTextView = (TextView) findViewById(R.id.dayTextView);
        LinearLayout timetableLayout = (LinearLayout) findViewById(R.id.timetableLayout);
        ImageView timetableImage = (ImageView) findViewById(R.id.timetableImage);

        if  (dayTextView.getText().toString() == "WEDNESDAY") {
            dayTextView.setText("TUESDAY");
            timetableImage.setImageResource(R.drawable.tuesday);

        } else if  (dayTextView.getText().toString() == "THURSDAY") {
            dayTextView.setText("WEDNESDAY");
            timetableImage.setImageResource(R.drawable.wednesday);

        } else if  (dayTextView.getText().toString() == "FRIDAY") {
            dayTextView.setText("THURSDAY");
            timetableImage.setImageResource(R.drawable.thursday);

        } else if  (dayTextView.getText().toString() == "SATURDAY") {
            dayTextView.setText("FRIDAY");
            timetableImage.setImageResource(R.drawable.friday);

        } else if  (dayTextView.getText().toString() == "SUNDAY") {
            dayTextView.setText("SATURDAY");
            timetableImage.setImageResource(R.drawable.saturday);

        } else if  (dayTextView.getText().toString() == "MONDAY") {
            dayTextView.setText("SUNDAY");
            timetableImage.setImageResource(R.drawable.saturday);

        } else if  (dayTextView.getText().toString() == "TUESDAY") {
            dayTextView.setText("MONDAY");
            timetableImage.setImageResource(R.drawable.monday);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        TextView dayTextView = (TextView) findViewById(R.id.dayTextView);
        ImageView timetableImage = (ImageView) findViewById(R.id.timetableImage);

        if (dayOfWeek == 2) {
            dayTextView.setText("MONDAY");
            timetableImage.setImageResource(R.drawable.monday);

        } else if (dayOfWeek == 3) {
            dayTextView.setText("TUESDAY");
            timetableImage.setImageResource(R.drawable.tuesday);

        } else if (dayOfWeek == 4) {
            dayTextView.setText("WEDNESDAY");
            timetableImage.setImageResource(R.drawable.wednesday);

        } else if (dayOfWeek == 5) {
            dayTextView.setText("THURSDAY");
            timetableImage.setImageResource(R.drawable.thursday);

        } else if (dayOfWeek == 6) {
            dayTextView.setText("FRIDAY");
            timetableImage.setImageResource(R.drawable.friday);

        } else if (dayOfWeek == 7) {
            dayTextView.setText("SATURDAY");
            timetableImage.setImageResource(R.drawable.saturday);

        } else if (dayOfWeek == 1) {
            dayTextView.setText("SUNDAY");
            timetableImage.setImageResource(R.drawable.saturday);
        }
    }
}

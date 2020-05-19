package sg.edu.rp.c346.id18016094.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDate, btnTime, btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDate = findViewById(R.id.buttonDisplayDate);
        btnTime = findViewById(R.id.buttonDisplayTime);
        btnReset = findViewById(R.id.buttonReset);
        tvDisplay = findViewById(R.id.textViewDisplay);

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Date is " + dp.getDayOfMonth() + "/" + (dp.getMonth()+1)  + "/" + dp.getYear());
            }
        });

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            tvDisplay.setText("Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute());
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2020,00,01);
            }
        });
    }
}

package sgholidays.android.myapplicationdev.com.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvHoliday;
    ArrayAdapter aa;
    ArrayList<Holiday> holidays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvHoliday = (TextView) findViewById(R.id.tvType);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tvHoliday.setText(type);

        lv = (ListView) findViewById(R.id.lvHoliday);
        holidays = new ArrayList<Holiday>();
        if (type == "Secular"){
            holidays.add(new Holiday("New Year's Day", "1 January 2017", true));
            holidays.add(new Holiday("Labour Day", "1 May 2017", true));
            holidays.add(new Holiday("National Day", "9 August 2017",  true));
        }
        else {
            holidays.add(new Holiday("Chinese New Year","28 - 29 January 2017", false));
            holidays.add(new Holiday("Good Friday","14 April 2017",false));
            holidays.add(new Holiday("Vesak Day", "10 May 2017" , false));
            holidays.add(new Holiday("Hari Raya Puasa", "25 June 2017", false));
            holidays.add(new Holiday("Hari Raya Haji", "1 September 2017",  false));
            holidays.add(new Holiday("Deepavali", "18 October 2017", false));
            holidays.add(new Holiday("Christmas Day", "25 December 2017", false));
        }



        aa = new HolidayAdapter(this, R.layout.row, holidays);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = holidays.get(position);

                Toast.makeText(SecondActivity.this, selectedHoliday.holidayName()
                                + ": " + selectedHoliday.holidayDate(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }

}

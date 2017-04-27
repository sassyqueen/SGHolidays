package sgholidays.android.myapplicationdev.com.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15004557 on 27/4/2017.
 */

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holidays;
    private Context context;
    private TextView tvName, tvDate;
    private ImageView ivHoliday;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvName = (TextView) rowView.findViewById(R.id.tvName);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        // Get the ImageView object
        ivHoliday = (ImageView) rowView.findViewById(R.id.ivHoliday);




        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentHoliday = holidays.get(position);
        // Set the TextView to show the food

        tvName.setText(currentHoliday.holidayName());

        tvDate.setText(currentHoliday.holidayDate());
        // Set the image to star or nostar accordingly
        if(currentHoliday.isSecular()) {
            if (currentHoliday.holidayName() == "New Year's Day") {
                ivHoliday.setImageResource(R.drawable.newyear);
            }
            else if (currentHoliday.holidayName() == "Labour Day"){
                ivHoliday.setImageResource(R.drawable.labourday);
            }
            else if (currentHoliday.holidayName() == "National Day"){
                ivHoliday.setImageResource(R.drawable.nationalday);
            }
        }
        else {
            if (currentHoliday.holidayName() == "Chinese New Year"){
                ivHoliday.setImageResource(R.drawable.cny);
            }
            else if (currentHoliday.holidayName() == "Good Friday"){
                ivHoliday.setImageResource(R.drawable.goodfriday);
            }
            else if (currentHoliday.holidayName() == "Vesak Day"){
                ivHoliday.setImageResource(R.drawable.vesakday);
            }
            else if (currentHoliday.holidayName() == "Hari Raya Haji"){
                ivHoliday.setImageResource(R.drawable.harirayahaji);
            }
            else if (currentHoliday.holidayName() == "Hari Raya Puasa"){
                ivHoliday.setImageResource(R.drawable.harirayapuasa);
            }
            else if (currentHoliday.holidayName() == "Deepavali"){
                ivHoliday.setImageResource(R.drawable.deepavali);
            }
            else if (currentHoliday.holidayName() == "Christmas Day"){
                ivHoliday.setImageResource(R.drawable.christmas);
            }

        }
        // Return the nicely done up View to the ListView
        return rowView;
    }

}

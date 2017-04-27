package sgholidays.android.myapplicationdev.com.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lvTypeHoliday);
        al = new ArrayList<String>();
        al.add("Secular");
        al.add("Ethnic and Religion");

        aa = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);
        aa.notifyDataSetChanged();

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){

                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("type", lv.getItemAtPosition(position).toString());
                    startActivity(i);
                } else if (position == 1){
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("type", lv.getItemAtPosition(position).toString());
                    startActivity(i);
                }

            }
        });


    }
}

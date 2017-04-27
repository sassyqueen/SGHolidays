package sgholidays.android.myapplicationdev.com.sgholidays;

/**
 * Created by 15004557 on 27/4/2017.
 */

public class Holiday {
    private String holidayName;
    private String holidayDate;


    public Holiday(String holidayName, String holidayDate){
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
    }

    public String holidayName(){
        return holidayName;
    }
    public String holidayDate(){
        return holidayDate;
    }

    }


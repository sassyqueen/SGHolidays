package sgholidays.android.myapplicationdev.com.sgholidays;

/**
 * Created by 15004557 on 27/4/2017.
 */

public class Holiday {
    private String holidayName;
    private String holidayDate;
    private boolean isSecular;

    public Holiday(String holidayName, String holidayDate, boolean isSecular){
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
        this.isSecular = isSecular;
    }

    public String holidayName(){
        return holidayName;
    }
    public String holidayDate(){
        return holidayDate;
    }
    public boolean isSecular(){
        return isSecular;
    }
}

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockService {

    public int getTime(){
        Date currentDate = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("HH");
        int currentHour = Integer.parseInt(ft.format(currentDate));
        return currentHour;
    }
}
